package giris;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n, i=1, total=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        while (n>i){
            i++;
            total *= i;

        }
        System.out.println("Faktöriyeli: " + total);
    }

}
