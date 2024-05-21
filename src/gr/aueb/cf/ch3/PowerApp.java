package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Υπολογίζει το base^power
 * ο χρηστης δινει τα base kai power
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base=0;
        int power=0;
        int result = 1;
        int i=1;
        System.out.println("please insert base and power");
        base= in.nextInt();
        power = in.nextInt();

        while (i<=power) {
            result = result *base;
            i++;
        }
        System.out.printf("%d ^ %d = %,d", base,power,result);
    }
}
