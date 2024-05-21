package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;
        boolean areequal = false;

        System.out.println("please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if(num1>num2) {
            min=num2;
            max=num1;
        } else if (num1<num2) {
            min=num1;
            max=num2;
        } else {
            System.out.println("inserted numbers are equal");
            areequal=true;
        }
        if (!areequal) {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
}
