package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Διαβαζει απο τον standard in εναν ακεραιο
 * που συμβολιζει μια θερμοκρασια και ελεγχει
 * αν η θερμοκρασια ειναι μικροτερη απο 0
 */

public class TemperatureApp {
    public static void main(String[] args) {

        Scanner in = new  Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero= false;

        System.out.println("please insert the temperature (integer):");

        temp = in.nextInt();
        isTempBelowZero = temp<0;

        System.out.println("Temp is below zero: " + isTempBelowZero);
    }
}
