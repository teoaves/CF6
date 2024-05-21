package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Μια απλη διαιρεση,
 * διαιρεση με 0 απαγορευεται.
 * Δινει AritheticExeption
 */

public class DivApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result =0;

        System.out.println("plase insert numerator and demoninator");
        numerator = in.nextInt();
        denominator = in.nextInt();

        if (denominator==0) {
            System.out.println("denominator can not be zero");
            System.exit(1);
        }
        if (numerator==0) {
            System.out.println("numerator can not be zero");
            System.exit(1);
        }
        result=numerator/denominator;
            System.out.println("result = " + result);
        }
    }

