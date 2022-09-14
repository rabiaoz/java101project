package giris;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n, total=1,i;

        System.out.print("Tabanı giriniz: ");
        n = input.nextInt();
        System.out.print("Üssü giriniz: ");
        k = input.nextInt();

        for (i=1 ; i<=k ; i++){
            total *= n;

        }
        System.out.println("Sonuç: " + total);
    }
}
