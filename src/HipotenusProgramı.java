import java.util.Scanner;

public class HipotenusProgramı {
    public static void main(String[] args) {
        double a ,b ,c ,f ;


        Scanner inp =new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        a = inp.nextDouble();

        System.out.println("2. kenarı giriniz: ");
        b = inp.nextDouble();

        f= (a*a + b*b);
        c = Math.sqrt(f);

        System.out.println("Hipotenüs uzunluğu: " + c);

    }
}
