package giris;
import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        int number, n, min=0, max=0;

        Scanner input = new Scanner(System.in);

        System.out.println("kaç tane sayı gireceksiniz?");
        n = input.nextInt();

        int i = 1;
        while (i<=n){
            System.out.print(i + ". sayıyı giriniz:");
            number = input.nextInt();

            if (i == 1){
                min = number ;
                max = number;
            }else {
                if (number > max){
                    max = number;
                }else if (number < min){
                    min = number;
                }
            }
            i++;
        }
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer:  " + min);
    }
}
