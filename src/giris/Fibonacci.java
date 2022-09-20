package giris;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        int i=1, a=0,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci dizisi kaç elemanlı olsun?");
        int n = input.nextInt();

        while (i < n){
           c = a+b;
           a=b;
           b=c;
           System.out.println(i + ". eleman: " + c);
           i++;

        }

    }
}
