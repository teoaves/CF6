package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TernaryOpApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;
        System.out.println("please insert two integers");

        num1 = in.nextInt();
        num2 = in.nextInt();

        min = (num1<num2) ? num1 : num2;

        System.out.printf("The min of (%d , %d) is: %d", num1, num2, min);


    }

}
