package gr.aueb.cf.ch6;

public class ArrayMin2 {
    public static void main(String[] args) {
        int [] arr = {7,3,9,6,2,12};
        int minposition;
        minposition=findMin(arr,0,arr.length-1);
        System.out.printf("min value: %d, min position: %d" , arr[minposition], minposition);

    }
    public static int findMin(int [] arr, int low, int height ) {
        int min = Integer.MAX_VALUE;
        int minposition=0;

        if((low<0) || height> arr.length-1) {
            System.out.println("error");
            return  -1;
        }

        for (int i=low; i< height; i++) {
            if(arr[i]<min) {
                min=arr[i];
                minposition=i;
            }
        }
        return minposition;
    }
}
