package giris;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }
    static int multiple(int a, int b){
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }
    static int divided(int a, int b){
        if (b != 0) {
            int result = a / b;
            System.out.println("Bölüm: " + result);
            return result;
        } else {
            System.out.println("2. sayı 0 olamaz.");
        } return 0;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Mod sonucu: " + result);
        return result;
    }
    static void rectangle(int a,int b){
        System.out.println("Alanı: " + (a * b));
        System.out.println("Çevresi: " + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1.)Toplama işlemi\n" +
                "2.)Çıkarma işlem\n" +
                "3.)Çarpma işlemi\n" +
                "4.)Bölme işlemi\n" +
                "5.)Üs alma\n" +
                "6.)Mod alma\n" +
                "7.)Dikdörtgen alan ve çevre hesabı\n" +
                "0.)Çıkış\n";

        System.out.println(menu);
        while (true){
            System.out.println("Bir işlem seçiniz: ");
            int select = input.nextInt();
            if (select==0){
                break;
            }


        System.out.println("1. sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = input.nextInt();

        switch (select) {
            case 1:
                sum(a, b);
                break;
            case 2:
                minus(a, b);
                break;
            case 3:
                multiple(a, b);
                break;
            case 4:
                divided(a, b);
                break;
            case 5:
                System.out.println(power(a, b));
                break;
            case 6:
                mod(a, b);
                break;
            case 7:
                rectangle(a, b);
                break;
            default:
                System.out.println("Geçersiz bir işlem giridiniz");

        }
        }
    }
}
