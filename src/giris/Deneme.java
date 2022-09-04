package giris;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if ((n % 2 ==1) || ((n>=6)&&(n<=20))){
            System.out.println("weird");
        }
        else {
            System.out.println("not weird");
        }

    }
}

