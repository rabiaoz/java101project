import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tr, mt, fz,km,mz,average;
        int tr1 , mt1, fz1, km1, mz1;
        System.out.println("!!0 ve 100 arasında girilmeyen notlar sıfır olarak hesaplanır.!!");

        System.out.print("Türkçe notonu giriniz: ");
        tr = input.nextInt();
        System.out.print("Matematik notonu giriniz: ");
        mt = input.nextInt();
        System.out.print("Fizik notonu giriniz: ");
        fz = input.nextInt();
        System.out.print("Kimya notonu giriniz: ");
        km = input.nextInt();
        System.out.print("Müzik notonu giriniz: ");
        mz = input.nextInt();

        if (tr>=0 && tr<=100)tr1 = tr;
        else tr1=0;
        if (mt>=0 && mt<=100) mt1 = mt;
        else mt1=0;
        if (fz>=0 && fz<=100)fz1 = fz;
        else fz1= 0;
        if (km>=0 && km<=100) km1 = km;
        else km1=0;
        if (mz>=0 && mz<=100) mz1 = mz;
        else mz1=0;

        average = (tr1+mt1+fz1+km1+mz1)/5;

        System.out.println("Ortalama: "+ average );
        if (average>=55){
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Üzgünüz! Sınıfı geçemediniz.");
        }
    }
}
