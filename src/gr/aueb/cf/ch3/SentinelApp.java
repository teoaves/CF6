package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Συνεχιζει το διαβασμα μεχρι να
 * δοθει μια ειδικη τιμη εστω -1
 */

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=0;
        int interation = 0;

        System.out.println("Please insert a num (-1 for exit)");

        num = in.nextInt();

        while (num!=-1) {
            interation++;
            System.out.println("Please insert a num ( -1 for exit)");
            num=in.nextInt();
        }

        System.out.println("Positives count: " + interation);

    }
}
