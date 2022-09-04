package giris;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double weight, height, index;

        System.out.print("Kilonuzu Giriniz (kg): ");
        weight = input.nextDouble();

        System.out.print("Boyunuzu Giriniz (m): ");
        height = input.nextDouble();

        index = weight / (height * height);
        System.out.print("Vücut Kitle İndeksiniz: " + index);
    }
}
