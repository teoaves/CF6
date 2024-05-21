package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Διαβάζει μία θερμοκρασία (ακέραια τιμή)
 * απ΄οτο standard input, καθώς και μία
 * boolean τιμή που αντιστοιχεί στο αν βρέχει,
 * και αποφασίζει αν χιονίζει (βρέχει και θερμοκρασία <0)
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRainning = false;
        boolean isSnowing = false;

        System.out.println("please inset if is rainning");

        isRainning = in.nextBoolean();

        System.out.println("please inset outside temperature");
        temp = in.nextInt();

        isSnowing = isRainning && (temp<0);

        System.out.println("Is snowing " + isSnowing);


    }
}

