package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Υπολογιζει το πληθος των ψηφιων
 * ενος ακεραιου με do while πχ αν ο
 * χρηστης δωσει το 259 τοτε το πληθος των
 * ψηφιων ειναι 3
 */

public class DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =0;
        int copyofnum= 0;
        int count = 0;
        int sum =0;
        int rhDigit =0;

        System.out.println("please insert num:");
        num= in.nextInt();
        copyofnum =num;

        do {
            count++;
            rhDigit=copyofnum%10;
            sum +=rhDigit;
            copyofnum = copyofnum / 10;
        } while (copyofnum !=0);

        System.out.println("Digil coun" +count);
        System.out.println("sum od digits" +sum);



    }
}
