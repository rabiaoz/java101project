package giris;

import java.util.Scanner;

public class IkininKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, i=1, a=1 ;

        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        while (number >= i) {
            System.out.println(i);
            i *= 4;
        }

        System.out.println("5'in kuvvetleri: ");
        while (number >= a) {
            System.out.println(a);
            a *= 5;
        }
    }
}