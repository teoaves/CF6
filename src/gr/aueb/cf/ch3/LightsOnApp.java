package gr.aueb.cf.ch3;

/** Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα ειτε είναι σκοτάδι ή
 * τρεχει με ταχυτητα υψηλη.Ο χρήστης εισαγει
 * τα τρια παραπανω στοιχεια και το προγραμμα εκτυπωνει
 * αν τα φωτα αναβουν ή οχι.
 */

import java.util.Scanner;

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isRainning = false;
        boolean isDark = false;
        boolean isRun = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean arelightsOn = false;

        System.out.println("Please insert if it is rainning");
        isRainning = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

          isRun = speed>=MAX_SPEED;

          arelightsOn = isRainning && (isRun || isDark);

        System.out.println("Are lights on:" + arelightsOn);



    }
}
