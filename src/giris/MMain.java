package giris;

import java.util.Scanner;

public class MMain {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fizik,kimya,tr,tarih,muzik;

        //Scanner sınıfını tanımladık
        Scanner inp =new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();


        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        tr = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();


        int toplam = (mat + fizik + kimya + tr + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul1 = sonuc>=60;
        boolean kosul2 = sonuc<60;


        String str = kosul1 ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);





    }
}
