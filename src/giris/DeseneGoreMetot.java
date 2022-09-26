package giris;
import java.util.Scanner;

public class DeseneGoreMetot {
    static void fonk(int x) {

        int tempx;
        tempx = x;

        while (x > 0) {
            x -= 5;
            System.out.println(x);
        }
        while (x < tempx){
            x += 5;
            System.out.println(x);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Denklem için bir sayı giriniz: ");
        int number = input.nextInt();
        fonk(number);
    }
}
