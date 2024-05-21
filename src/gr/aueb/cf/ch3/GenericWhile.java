package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GenericWhile {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("please insert start value, end and step value");

        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        while (start <= end) {

            count++;
            start += step;


        }

        System.out.println("count is: " +count );
    }
}
