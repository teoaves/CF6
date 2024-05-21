package gr.aueb.cf.ch3;

import java.util.Scanner;

/** ο χρηστης δινει το n ωστε να
 * υπολογιστει το 1+2..n και
 * το 1*2...n
 */

public class GenericSumMul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =1;
        int n = 0;
        int sum = 0;
        int mul= 1;

        System.out.println("please insert n:");
        n = in.nextInt();

        while (i<=n) {
            sum +=i;
            mul *=i;
            i++;
        }
        System.out.printf("Sum = %d, Mul = %,d", sum, mul);

    }
}
