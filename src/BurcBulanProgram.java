import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner (System.in);
        System.out.println("Doğum ayınızı giriniz: ");
        month = input.nextInt();
        if (month<1 || month>12){
            System.out.println("Ay girişi hatalı!!! ");
        }else {

            System.out.println("Doğum gününüzü giriniz: ");
            day = input.nextInt();

            if (month==1 && (day<22 && day >0) || month==12 && (day>21 && day<=31)){
            System.out.println("Burcunuz oğlak");
            }
            if (month==2 && (day<20 && day >0) || month==1 && (day>21 && day<=31)){
                System.out.println("Burcunuz kova");
            }
            if (month==3 && (day<=20 && day >0) || month==2 && (day>=20 && day<=29)){
                System.out.println("Burcunuz balık");
            }
            if (month==4 && (day<22 && day >0) || month==3 && (day>=21 && day<=31)){
                System.out.println("Burcunuz koç");
            }
            if (month==5 && (day<22 && day >0) || month==4 && (day>=21 && day<31)){
                System.out.println("Burcunuz boğa");
            }
            if (month==6 && (day<=22 && day >0) || month==5 && (day>21 && day<=31)){
                System.out.println("Burcunuz ikizler");
            }
            if (month==7 && (day<=22 && day >0) || month==6 && (day>22 && day<31)){
                System.out.println("Burcunuz yengeç");
            }
            if (month==8 && (day<=23 && day >0) || month==7 && (day>=23 && day<=31)){
                System.out.println("Burcunuz aslan");
            }
            if (month==9 && (day<=22 && day >0) || month==8 && (day>=23 && day<=31)){
                System.out.println("Burcunuz başak");
            }
            if (month==10 && (day<=22 && day >0) || month==9 && (day>=23 && day<31)){
                System.out.println("Burcunuz terazi");
            }
            if (month==11 && (day<22 && day >0) || month==10 && (day>=23 && day<=31)){
                System.out.println("Burcunuz akrep");
            }
            if (month==12 && (day<22 && day >0) || month==11 && (day>=22 && day<31)){
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Gün girişini hatalı yaptınız: ");
            }
        }
    }
}
