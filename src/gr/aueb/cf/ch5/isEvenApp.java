package gr.aueb.cf.ch5;

public class isEvenApp {
    public static void main(String[] args) {
        int num = 11;
        boolean isEven = false;

        isEven=isEven(11);

        System.out.printf("%d is even: %b", num, isEven);
        System.out.printf("%d is%seven", num, isEven? " " : "not");

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;

    }

}
