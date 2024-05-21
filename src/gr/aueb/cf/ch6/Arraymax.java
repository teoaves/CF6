package gr.aueb.cf.ch6;

public class Arraymax {
    public static void main(String[] args) {
        int [] arr = {7,6,2,9,10,4,1,6,7};
        int maxPosition = 0;
        int maxValue = arr[maxPosition];



        for (int i =0; i< arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;

                maxValue = arr[maxPosition];

            }
        }

        System.out.printf("Max value: %d, Max position: %d ", maxValue, maxPosition);
    }
}



