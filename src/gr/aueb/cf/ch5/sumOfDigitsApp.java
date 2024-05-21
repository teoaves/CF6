package gr.aueb.cf.ch5;

public class sumOfDigitsApp {
    public static void main(String[] args) {
        int num = 105;
        int sumOfDigits = 0;

        sumOfDigits=getSumOfDigitis(num);
        System.out.printf("sum of digits of %d is %d", num, sumOfDigits);


    }

    public static int getSumOfDigitis(int num) {
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do {
            rightDigit = left % 10;
            sum += rightDigit;
            left = left / 10;
        } while (left != 0);
        return  sum;



    }
}
