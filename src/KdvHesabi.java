import java.util.Scanner;

public class KdvHesabi {


    public static void main(String[] args) {
        double kdv1=0.18 , kdv2 =0.08 ;
        int tutar;

        Scanner inp =new Scanner(System.in);

        System.out.println("Fiyatı giriniz: ");
        tutar = inp.nextInt();

        double toplamKdv = (tutar>=1000) ? (tutar*kdv2) : (tutar*kdv1) ;
        double toplamFiyat = (tutar+toplamKdv);

        System.out.println("KDV tutarı :" + toplamKdv);
        System.out.println("KDV'li tutar:" + toplamFiyat);





    }
}
