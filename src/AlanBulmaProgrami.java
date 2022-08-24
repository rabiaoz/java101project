import java.util.Scanner;

public class AlanBulmaProgrami {
    public static void main(String[] args) {
        double a, b, c, u, t,S;


        Scanner inp =new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        a = inp.nextDouble();

        System.out.println("2. kenarı giriniz: ");
        b = inp.nextDouble();

        System.out.println("3. kenarı giriniz: ");
        c= inp.nextDouble();

        u = (a+b+c)/2;
        t= (u*(u-a)*(u-b)*(u-c));
        S= Math.sqrt(t);

        System.out.println("Üçgenin Alanı: "+ S);

    }
}
