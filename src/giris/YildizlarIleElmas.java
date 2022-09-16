package giris;
import java.util.Scanner;
public class YildizlarIleElmas {
    public static void main(String[] args) {
        int n, k,j,i,a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın gövdesinde olacak yıldız sayısını giriniz: ");
        n = input.nextInt();

        for (i=1;i<=n;i++){
           for (k=1;k<=(n-i);k++){
               System.out.print(" ");
           }
           for (j=1;j<=(2*i-1);j++){
               System.out.print("*");
           }
            System.out.println();
        }

        for (a=(n-1);a>0;a--){
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
