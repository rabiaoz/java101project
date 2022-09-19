package giris;
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3, select, bakiye = 1500, add, reduce;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız.\nMerhaba, Java Bankasına Hoşgeldiniz!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                System.out.println("1.)Para yatırma\n2.)Para Çekme\n3.)Bakiye Sorgulama\n4.)Çıkış Yap");
                select = input.nextInt();
                switch (select) {
                    case 1 -> {
                        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                        add = input.nextInt();
                        bakiye += add;
                        System.out.println("Güncel Bakiyeniz: " + bakiye);
                    }
                    case 2 -> {
                        System.out.println("Çekmek istediğiniz miktarı giriniz:");
                        reduce = input.nextInt();
                        if (reduce > bakiye) {
                            System.out.println("Yetersiz Bakiye.");
                        } else {
                            bakiye -= reduce;
                            System.out.println("Güncel Bakiyeniz: " + bakiye);
                        }
                    }
                    case 3 -> System.out.println("Bakiyeniz: " + bakiye);
                    case 4 -> System.out.println("Çıkış Başarılı.");
                    default -> System.out.println("Lütfen geçerli bir işlem seçiniz.");
                }


            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre yanlış. Lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + right);
                if (right == 0) {
                    System.out.println("Kartınız bloke olmuştur. Bankanızla iletişime geçiniz.");
                }
            }
        }
    }
}
