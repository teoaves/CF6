package gr.aueb.cf.ch6;

public class BinnarySearchApp {

        public static void main(String[] args) {
            int[] arr = {1, 6, 9, 23, 25, 68, 77, 90};
            int value = 68;
            int position;
            int low = 0;
            int hight = arr.length - 1;
            position = binarySearch(arr, value, low, hight);
            System.out.printf("position:%d, value:%d ", position, arr[position]);
        }


        public static int binarySearch(int[] arr, int value, int low, int hight) {
            int mid = 0;
            if (arr == null) return -1;
            if (low < 0 || hight > arr.length - 1) return -1;
            if (low > hight) return -1;


            mid = (low + hight) / 2;
            if (arr[mid] == value) return mid;
            if (value > arr[mid]) {
                return binarySearch(arr, value, mid + 1, hight);
            } else {

                return binarySearch(arr, value, low, mid - 1);
            }
        }
    }

