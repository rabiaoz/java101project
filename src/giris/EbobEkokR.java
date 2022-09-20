package giris;
import java.util.Scanner;

public class EbobEkokR {
    public static void main(String[] args) {
        int n1, n2, newn1, newn2, ebob=1, ekok=1;

        Scanner input = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz: ");
        n1 = input.nextInt();
        newn2=n1;

        System.out.println("2.sayıyı giriniz: ");
        n2 = input.nextInt();
        newn1=n2;

        if (n1>n2){
            n1=newn1;
            n2=newn2;
        }

        int i=1;
        while (i<=n1){
            if (n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOBLARI: " + ebob);
        ekok = (n1*n2) / ebob;
        System.out.println("EKOKLARI: " + ekok);

        /*while(i<=(n1*n2)){
            if(i%n1==0 && i%n2==0){
                ekok = i;
                System.out.println("EKOKLARI: " + ekok);
                break;
            }
            i++;
        }*/
    }
}
