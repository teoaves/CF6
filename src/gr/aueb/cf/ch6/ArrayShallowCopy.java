package gr.aueb.cf.ch6;

public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arrShallowCopy;
        arrShallowCopy = arr;
        arrShallowCopy[0] = 100;
        printArray(arr);


    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item + " ");
        }
    }
}
