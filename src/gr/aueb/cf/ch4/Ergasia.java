package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Ergasia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = 0;
        int num = 0;
        int result ;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }
            if (choice==6) {
                System.out.println("thanks for using our app");
                break;
            }

            System.out.println("please insert a num");
            num = getOneNumber();
            result = getResult(choice, num);


        } while (true);


    }

            public static void printMenu() {
            System.out.println("");
            System.out.println(" Επιλέξτε ένα από τα παρακάτω ");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
        }

           public static int getUserChoice() {
                return in.nextInt();
        }
    public static int getOneNumber() {
        return in.nextInt();
    }
        public static int getResult(int choice, int num) {

            switch (choice) {
                case 1:
                    for (int i = 1; i <= num; i++) {


                        System.out.print("*");
                    }
                    return num;
                case 2:
                    for (int i = 1; i <= num; i++) {


                        System.out.println("*");
                    }
                    return num;

                case 3:
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= num; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    return num;

                case 4:


                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    return num;

                case 5:
                    for (int i = 1; i <= num; i++) {
                        for (int j = i; j <= num; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    return num;
                case 6:
                    System.out.println("exit");
                    return num;

                default:
                    System.out.println("Λαθος επιλογη");
                    return 0;


            }

        }








    }












