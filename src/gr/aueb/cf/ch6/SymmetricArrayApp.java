package gr.aueb.cf.ch6;

public class SymmetricArrayApp {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        System.out.println("is symetrric: " + isSymetric(arr));

    }

    public static boolean isSymetric (int[]arr){
        boolean symetric = true;

        for (int i=0, j=arr.length-1; i<j; i++, j--){
            if ( arr [i]!=arr[j]){
                symetric = false;
                break;
            }
        }
        return symetric;

    }
}

