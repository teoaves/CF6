package gr.aueb.cf.ch6;

public class ArrayMinApp {
    public static void main(String[] args) {
        int [] arr = {7,6,2,9,10,4,1,6,7};
        int minPosition = 0;
        int minValue = arr[minPosition];
        int minPosition2 =0;
        int minValue2 = arr[minPosition2];


        for (int i =1; i< arr.length; i++) {
            if (arr[i] <minValue) {
                minPosition2=minPosition;
                minPosition = i;
                minValue2=minValue;
                minValue= arr[minPosition];

            }
            else if (arr[i]<minValue2 && arr[i] !=minValue) {
                minPosition2=i;
                minValue2=arr[minValue2];
            }
        }
        System.out.printf("Min value: %d, Min position: %d ", minValue2, minPosition2);
    }
}
