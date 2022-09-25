package giris;
import java.util.Scanner;

public class RecursivePower {
    static int pow(int base, int power){
        if (power == 0){
            return 1;
        }
        return base * pow(base, power - 1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tabanı giriniz: ");
        int base = input.nextInt();
        System.out.println("Üssü giriniz: ");
        int power = input.nextInt();

        System.out.println("Sonuç: " + pow(base,power));

    }
}
