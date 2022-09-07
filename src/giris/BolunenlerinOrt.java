package giris;

import java.util.Scanner;

public class BolunenlerinOrt {
    public static void main(String[] args) {
         int k;
         double ort ,adet = 0, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("k sayısını giriniz: ");
        k = input.nextInt();

        int i = 0;
        while (i <= k){
            i++;
            if (i % 12 == 0){
                toplam += i;
                adet++;
            }
        }

        ort = (toplam/adet) ;
        System.out.println("ortalaması: " + ort);

    }
}
