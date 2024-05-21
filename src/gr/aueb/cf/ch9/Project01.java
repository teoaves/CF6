package gr.aueb.cf.ch9;

import java.io.*;
import java.util.Arrays;

public class Project01 {

    public static void main(String[] args) {
        try {
            // Διαβάζουμε τους αριθμούς από το αρχείο
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\akeraioi.txt"));
            int[] numbers = new int[49];
            int count = 0;
            String line;

            while ((line = br.readLine()) != null) { //οταν θες να διαβαζει καθε γραμμη μεχρι να τελειωσουν οι γραμμες
                String[] parts = line.split(",");
                for (String part : parts) {
                    int number = Integer.parseInt(part.trim());
                    if (number >= 1 && number <= 49) {
                        numbers[count++] = number;
                    }
                }
            }
            br.close();

            if (count < 6) {
                System.out.println("Το αρχείο πρέπει να περιέχει τουλάχιστον 6 αριθμούς.");
                return;
            }

            // Μείωση μεγέθους του πίνακα στον πραγματικό αριθμό των στοιχείων
            numbers = Arrays.copyOf(numbers, count);
            Arrays.sort(numbers);

            // Γράφουμε τους συνδυασμούς απευθείας στο αρχείο εξόδου
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\keno.txt"));
            generateCombinations(numbers, new int[6], 0, 0, bw);
            bw.close();
            System.out.println("Οι έγκυρες εξάδες γράφτηκαν στο αρχείο keno.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateCombinations(int[] numbers, int[] combination, int start, int depth, BufferedWriter bw) throws IOException {
        if (depth == 6) {
            if (isValidCombination(combination)) {
                bw.write(Arrays.toString(combination));
                bw.newLine();
            }
            return;
        }
        for (int i = start; i < numbers.length; i++) {
            combination[depth] = numbers[i];
            generateCombinations(numbers, combination, i + 1, depth + 1, bw);
        }
    }

    private static boolean isValidCombination(int[] combination) {
        return hasMaxEven(combination, 4) && hasMaxOdd(combination, 4) && hasMaxContiguous(combination, 2)
                && hasMaxSameEnding(combination, 3) && hasMaxSameTen(combination, 3);
    }

    private static boolean hasMaxEven(int[] combination, int max) {
        int count = 0;
        for (int number : combination) {
            if (number % 2 == 0) count++;
        }
        return count <= max;
    }

    private static boolean hasMaxOdd(int[] combination, int max) {
        int count = 0;
        for (int number : combination) {
            if (number % 2 != 0) count++;
        }
        return count <= max;
    }

    private static boolean hasMaxContiguous(int[] combination, int max) {
        int count = 1;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] == combination[i - 1] + 1) {
                count++;
                if (count > max) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }

    private static boolean hasMaxSameEnding(int[] combination, int max) {
        int[] endings = new int[10];
        for (int number : combination) {
            endings[number % 10]++;
        }
        for (int count : endings) {
            if (count > max) return false;
        }
        return true;
    }

    private static boolean hasMaxSameTen(int[] combination, int max) {
        int[] tens = new int[5];
        for (int number : combination) {
            tens[number / 10]++;
        }
        for (int count : tens) {
            if (count > max) return false;
        }
        return true;
    }
}

