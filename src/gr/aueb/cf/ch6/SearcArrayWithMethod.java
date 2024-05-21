package gr.aueb.cf.ch6;

public class SearcArrayWithMethod {
    public static void main(String[] args) {
        int [] quantities = {200,100,300};
        int position = 0;
        int value = 100;

        position=getElementPosition(quantities, value);
        System.out.printf("position: %d value: %d ", position, quantities[position]);
    }

    public static int getElementPosition(int [] arr, int value) {
        if (arr==null) return -1;

        for (int i=0; i < arr.length; i++) {
            if (arr[i]==value) {
                return i;
            }
        }
        return -1;
    }
}
