package gr.aueb.cf.ch6;

public class px {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        boolean isPositive = positive(arr);
        System.out.println("Is positive:" + isPositive);
    }
    public static boolean positive(int [] arr) {
        boolean isPositive=false;
        for (int i=0; i< arr.length; i++) {
            if (arr[i]>0) {
                isPositive=true;
                break;
            }
        }
        return isPositive;
    }

   }


