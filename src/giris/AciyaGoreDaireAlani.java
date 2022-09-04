package giris;

import java.util.Scanner;

public class AciyaGoreDaireAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r, alpha, S, pi=3.14;

        System.out.print("Yarıçapı Giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez Açıyı Giriniz: ");
        alpha = input.nextDouble();

        S = (pi * r * r) * alpha / 360;

        System.out.print("Daire Diliminin Alanı: " + S);

    }
}
