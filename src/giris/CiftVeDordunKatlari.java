package giris;

import java.util.Scanner;

public class CiftVeDordunKatlari {
    public static void main(String[] args) {
        int number, total=0;

        Scanner scn = new Scanner(System.in);

        do
        {
            System.out.print("Sayı giriniz: ");
            number = scn.nextInt();

            if (number % 4 == 0) {
                total += number;
            }
        }while (number % 2 == 0);

        System.out.println("Toplam: " + total);
    }
}
