package gr.aueb.cf.ch3;

import java.util.Scanner;

public class WhileDivApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("please insert two integers for division");

        while (true) {

            numerator=in.nextInt();
            denominator=in.nextInt();

            if(numerator==0) {
                System.out.println("numerator os zero");
                break;
            }
            if (denominator==0) {
                System.out.println("denominator should not zero");
                continue;
            }
            result = numerator/denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        }

        System.out.println("thank you for using our app");
    }
}
