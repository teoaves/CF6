package gr.aueb.cf.ch6;

public class ArrayMaxWithMethod {
    public static void main(String[] args) {
        int [] arr = {7,3,9,6,2,12};
        int maxposition;
        maxposition=findMax(arr, 0,arr.length-1);
        System.out.printf("max value: %d, max position: %d" , arr[maxposition], maxposition);

    }
    public static int findMax (int [] arr, int low, int height ) {
        int max = Integer.MIN_VALUE;
        int maxposition=0;

        if((low<0) || height> arr.length-1) {
            System.out.println("error");
            return  -1;
        }

        for (int i=low; i<= height; i++) {
            if(arr[i]>max) {
                max=arr[i];
                maxposition=i;
            }
        }
        return maxposition;
    }
}



