package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowAtMain {
    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;
        File fd = new File("C");

        try (Scanner in = new Scanner(fd)) {
            num = in.nextInt();
            System.out.println(num);

        } catch  (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    }

