package giris;

public class main {
    public static void main(String[] args) {
        System.out.print("BİRİNCİ MAKALE \n");
        byte vByte = 14;
        System.out.println(vByte);

        float vFloat = 2.8f;
        System.out.println(vFloat);

        char vChar = 't';
        char vvchar = 106;
        System.out.println(vChar);
        System.out.println(vvchar);

        boolean durum1 = true;
        System.out.println(durum1);

        String VsTR = "RABİA";
        System.out.println(VsTR);

        boolean sonuc = 5 > 1;
        System.out.println(sonuc);

        int a=3 ,b=5;
        boolean res = a==b;
        System.out.println(res);

        int d=5 , e=5 , c=3;
        boolean kosul1 = d==e ;
        boolean kosul2 = e>c;
        boolean so = kosul2 && kosul1;

        String str = so ?  "doğru" : "değil";
        int result = so ? 1 : 0;

        System.out.println(str);

        byte p = 0;
        int u = p++;
        System.out.print(u);




    }
}

