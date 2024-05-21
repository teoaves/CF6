package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Μετραει τους θετικους αριθμους που
 * δινει ο χρηστης μεχρι να δωσει 0
 */

public class PositivesCount {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int num=0;
        int positivesCount = 0;

        System.out.println("Please insert a num (0 for exit)");

        num = in.nextInt();

        while (num>=0) {
            positivesCount++;
            System.out.println("Please insert a num ( 0 for exit)");
            num=in.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);

        
    }
}
