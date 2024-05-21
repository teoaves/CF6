package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CalculateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("PLEASE INSERT TWO DOUBLES");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calculateArea (width, height);
        System.out.println("AREA:" +area);
    }

    public static double calculateArea (double width, double height) {
        return width*height;
    }
}
