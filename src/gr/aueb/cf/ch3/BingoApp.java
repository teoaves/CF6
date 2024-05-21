package gr.aueb.cf.ch3;

import java.util.Scanner;

/** ο χρηστης μαντευει
 * εναν μυστικο αριθμο
 */

public class BingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isBingo = false;

        do {

            System.out.println("please insert a num");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                isBingo = true;
            } else {
                System.out.println("try again");
            }
        } while (!isBingo) ;




    }
}

