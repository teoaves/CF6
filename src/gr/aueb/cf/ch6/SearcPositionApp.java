package gr.aueb.cf.ch6;

public class SearcPositionApp {
    public static void main(String[] args) {
        final int KEY = 10;
        int[] arr = {1, 5, 8, 9, 10, 15};
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                position = i;

                break;
            }
        }
        if (position == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("The element %d was found at position: %d ", arr[position], position);
        }
    }
}

