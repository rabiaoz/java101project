import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int age, travelType, km;
        double perKm=0.1, price, price2, saleRatio, sale, sale2, totalPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz KM mesafesini yazınız: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.println("Seyahat tipini seçiniz:\n1-)Tek yön \n2-)Gidiş-Dönüş");
        travelType= input.nextInt();


        if (! (km>=0 && age>=0 && (travelType==1 || travelType ==2)) ){
            System.out.println("Hatalı giriş yaptınız!!!");
        }else {

            if (age < 12) {
                saleRatio = 0.5;
            } else if (age > 13 && age < 25) {
                saleRatio = 0.1;
            } else if (age > 65) {
                saleRatio = 0.3;
            } else {
                saleRatio = 0;
            }

            if (travelType == 2) {
                sale2 = 0.2;
            } else {
                sale2 = 0;
            }

            price = perKm * km;

            sale = price * saleRatio;
            price2 = price - sale;

            sale2 = price2 * sale2;
            totalPrice = price2 - sale2;

            if (travelType == 2) {
                totalPrice *= 2;
            }

            System.out.print("Toplam Tutar: " + totalPrice + "TL");
        }
    }
}
