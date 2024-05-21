package gr.aueb.cf.ch6;

public class SelectionSort2 {
    public static void main(String[] args) {
        int [] arr = {34,25,42,100,1,50,66};

        selectionSort(arr);
        traverseArray(arr);

    }

    public static void selectionSort(int [] arr) {
        if (arr == null) return;
        int min;
        int minposition;
        for (int i = 0; i < arr.length; i++) {
            minposition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minposition = j;
                }
            }
            swap(arr, i, minposition);

        }
    }

    public static void swap(int [] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }

    public static void traverseArray(int [] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

