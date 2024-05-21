package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CalculatorApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("lathos epilogi");
                continue;
            }

            System.out.println("please insert two ints");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(choice, num1, num2);
            System.out.println("result:" + result);

        } while (choice == 6);
        System.out.println("thanks for using our app");
    }

    public static void printMenu() {
        System.out.println("epelekse ena apo ta parakatw");
        System.out.println("1.prosthesi");
        System.out.println("2.afairesh");
        System.out.println("3.pollaplasiasmos");
        System.out.println("4.diairesi");
        System.out.println("5.mod");
        System.out.println("6.ejodos");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getResult(int choice, int num1, int num2) {
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("lathos epilogi");
        }
        return result;
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: division by zero");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: modulo by zero");
            return 0;
        }
        return a % b;
    }

    public static int getOneNumber() {
        return in.nextInt();
    }
}
