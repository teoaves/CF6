package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsToDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60*60;
        final int SECK_PER_DAY = 24*60*60;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;
        int totalSeconds = 0;

        System.out.println("Please insert total seconds");

        totalSeconds = in.nextInt();

        days = totalSeconds/SECK_PER_DAY;
        remainingSeconds = totalSeconds%SECK_PER_DAY;

        hours= remainingSeconds/SECS_PER_HOUR;
        remainingSeconds = remainingSeconds%SECS_PER_HOUR;

        minutes = remainingSeconds/SECS_PER_MINUTE;
        remainingSeconds = remainingSeconds%SECS_PER_MINUTE;

        System.out.printf("Total seconds: %d, total days: %d, total hours: %02d, total minutes: %02d, total seconds: %02d",
                 totalSeconds, days, hours, minutes, remainingSeconds);
    }
}
