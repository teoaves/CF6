package gr.aueb.cf.ch3;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;

        System.out.println("please insert a num:");



        do {
            num = in.nextInt();
            if (num == 1) {
                System.out.println("Εισαγωγή");

            } else if (num == 2) {
                System.out.println("Διαγραφή");

            } else if (num == 3) {
                System.out.println("Ενημέρωση");

            } else if (num == 4) {
                System.out.println("Αναζήτηση");

            } else if (num == 5) {
                System.out.println("Έξοδος");

            }
            else {
                System.out.println("Λάθος αριθμός");
            }
        }
        while (num != 5); {
            System.out.println("goodbye");
        }













    }
}
