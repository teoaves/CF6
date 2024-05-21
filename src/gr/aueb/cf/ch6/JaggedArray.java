package gr.aueb.cf.ch6;

public class JaggedArray {
    public static void main(String[] args) {
        int [][] arr = new int [3][];

        arr[0] = new int [4];
        arr[1]=  new int [3];
        arr[2]=  new int [2];

        for (int[] row : arr){
            for (int col: row) {
                System.out.println(col+" ");
            }
            System.out.println();
        }
    }
}


