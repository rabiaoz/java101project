package giris;
import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        int number, total=0, basValue;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        number = input.nextInt();

        while ( number!= 0){
            basValue= number % 10;
            total += basValue;
            number /= 10;
        }
        System.out.println("Basamak değerleri toplamı: " + total);

    }
}
