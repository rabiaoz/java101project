import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String burc = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz :");
        year = input.nextInt();

        if (year % 12 == 0){
            burc = "Maymun";
        }else if (year % 12 == 1){
            burc = "Horoz";
        }else if (year % 12 == 2){
            burc = "Köpek";
        }else if (year % 12 == 3){
            burc = "Domuz";
        }else if (year % 12 == 4){
            burc = "Fare";
        }else if (year % 12 == 5){
            burc = "Öküz";
        }else if (year % 12 == 6){
            burc = "Kaplan";
        }else if (year % 12 == 7){
            burc = "Tavşan";
        }else if (year % 12 == 8){
            burc = "Ejderha";
        }else if (year % 12 == 9){
            burc = "Yılan";
        }else if (year % 12 == 10){
            burc = "At";
        }else if (year % 12 == 11){
            burc = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
