import java.util.Scanner;

public class KullaniciSifre {
    public static void main(String[] args) {
        String userName, password, newPassword, answer;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }
        else {
            System.out.println("Şifreniz Yanlış!!!\nŞifrenizi değiştirmek istiyor musunuz? Değiştirmek için \"EVET\" yazınız.");}
             answer = input.nextLine();
            if (answer.equals("EVET")){
                System.out.println("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")){
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz! Lütfen tekrar deneyin!");
                } else {
                    System.out.println("Yeni şifreniz kaydedildi.");
                }

            }
    }
}
