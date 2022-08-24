import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pear=2.14, apple=3.67, tomato=1.11, banana=0.95, eggplant=5.00, pearkg, applekg, tomatokg, bananakg, eggplantkg, totalCost;
        System.out.print("Kaç kilo armut? ");
        pearkg= input.nextDouble();

        System.out.print("Kaç kilo elma? ");
        applekg= input.nextDouble();

        System.out.print("Kaç kilo domates? ");
        tomatokg= input.nextDouble();

        System.out.print("Kaç kilo muz? ");
        bananakg= input.nextDouble();

        System.out.print("Kaç kilo patlıcan? ");
        eggplantkg= input.nextDouble();

        totalCost = (pear*pearkg) + (apple*applekg) + (tomato*tomatokg) + (banana*bananakg) + (eggplant*eggplantkg);
        System.out.println("Toplam Tutar: " + totalCost);


    }
}
