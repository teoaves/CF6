package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please insert a num:");
        inputNum = in.nextInt();
        System.out.printf("%d is even: %b", inputNum, isEven(inputNum));
    }

        public static boolean isEven(int inputnum) {
            return inputnum % 2 == 0;
        }
    }

