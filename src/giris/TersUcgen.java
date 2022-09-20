package giris;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n,a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın gövdesinde olacak yıldız sayısını giriniz: ");
        n = input.nextInt();

        for (a=n;a>0;a--){
            for (b=1;b<=(n-a);b++){
                System.out.print(" ");
            }
            for (c=1;c<=(2*a-1);c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
