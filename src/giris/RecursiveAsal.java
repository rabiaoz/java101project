package giris;
import java.util.Scanner;

public class RecursiveAsal {
    static void asal(int x){
        int i = 1;
        int counter = 0;
        while (i<=x){
            if (x % i == 0){
                counter++;
            }
            i++;
        }

        if (counter == 2){
            System.out.println(x + " asal sayıdır.");
        } else {
            System.out.println(x + " asal sayı değildir.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int x = input.nextInt();
        asal(x);

    }
}