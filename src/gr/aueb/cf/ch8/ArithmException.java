package gr.aueb.cf.ch8;
import java.util.Scanner;


import java.util.InputMismatchException;
import java.util.Scanner;

    public class ArithmException {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int numerator = 0;
            int denominator = 0;
            int result = 0;
            try {
                System.out.println("Please insert numerator and denominator");
                numerator = in.nextInt();
                denominator = in.nextInt();

                result = numerator / denominator;
                System.out.printf("%d / %d = %d ", numerator, denominator, result);
            } catch (ArithmeticException e) {
//            e.printStackTrace();
                System.out.println("Error Denominator can not be zero ");
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Please insert an Integer");
            }
            System.out.println("Thanks for using the app");
        }
    }
