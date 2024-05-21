package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Λαμβάνει true/false απο το standard input
 * για 2 δεξαμενες αν και οι 2 εχουν καυσιμα μικροτερα απο
 * το 1/4 τοτε αναβει κοκκινο, αν η μια απο τις 2
 * εχει μικροτερο απο 1/4 τοτε αναβει πορτοκαλι.
 */

public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isLessTQuarterTank1 = false;
        boolean isLessTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank1 is LT quarter");
        isLessTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter");
        isLessTQuarterTank2 = in.nextBoolean();

        isRed = isLessTQuarterTank1 && isLessTQuarterTank2;
        isOrange = isLessTQuarterTank1 ^ isLessTQuarterTank2;

    }
}
