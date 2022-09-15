package giris;
import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        n = input.nextInt();

        double total=0.0, fonk, i=1.0;

        while (i<=n){
            fonk = 1 / i;
            total += fonk;
            i++;
        }
        System.out.println("Sonuç: " + total);
    }
}
