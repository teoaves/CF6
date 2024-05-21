package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMisMatchException2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum=0;
        final int MAGIC = 12;

        while(true) {
            System.out.println("please insert an int");

            if(in.hasNextInt()) {
                inputNum=in.nextInt();
            } else {
                System.out.println("please insert a valid int");
                in.nextLine();
                continue;
            }
            if(inputNum==MAGIC) break;
            System.out.println(inputNum);

        }
    }
}
