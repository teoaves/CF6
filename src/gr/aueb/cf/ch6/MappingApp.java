package gr.aueb.cf.ch6;

public class MappingApp {
    public static void main(String[] args) {

    }

    public static int[] mapDouple(int[] arr) {
        int [] arrayToreturn =  new int  [arr.length];

        for (int i=0; i<arr.length; i++){
            arrayToreturn[i] = arr[i] *2;
        }
        return arrayToreturn;
    }
}

