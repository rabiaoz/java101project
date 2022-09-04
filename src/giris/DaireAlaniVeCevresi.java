package giris;

import java.util.Scanner;

public class DaireAlaniVeCevresi {
    public static void main(String[] args) {

        double r, S, CVR, pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz: ");
        r = input.nextDouble();

        CVR = 2 * pi * r;
        S = pi * r * r;

        System.out.println("Dairenin Alanı: " + S);
        System.out.println("Dairenin Çevresi: " + CVR);

    }
}