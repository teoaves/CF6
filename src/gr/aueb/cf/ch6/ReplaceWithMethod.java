package gr.aueb.cf.ch6;

public class ReplaceWithMethod {
    public static void main(String[] args) {
        int [] grades = {4,2,8,9,5};
        upscaleByone(grades);
        printArray(grades);
    }

    public static void upscaleByone(int [] arr) {
        for (int i=0; i< arr.length; i++) {
            arr[i] +=1;
        }
    }

    public static void printArray(int [] arr) {
        for (int item : arr) {
            System.out.println(item + " ");
        }
    }
}
