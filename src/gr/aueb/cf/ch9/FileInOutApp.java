package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOutApp {
    public static void main(String[] args) {
        File infd = new File("C:tmp/file6.txt");
        File outfd = new File("C:tmp/file6out.txt");
        String line;
        String[] tokens;


        try (Scanner in = new Scanner(infd);
        PrintWriter pw= new PrintWriter(outfd)) {
    while (in.hasNextLine()) {
        line = in.nextLine();
        tokens = line.split(" +");

                for (String token : tokens) {
                    pw.printf("%s ", token);
                    pw.flush();
                }
                pw.println();
    }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
