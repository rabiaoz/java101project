import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double startPrice= 10, perKM =2.2, totalPrice, km ;

        System.out.println("KM Giriniz: ");
        km = input.nextDouble();

        totalPrice = (startPrice + perKM * km);

        totalPrice = (totalPrice<20) ? 20 : totalPrice;
        System.out.println(totalPrice);



    }
}
