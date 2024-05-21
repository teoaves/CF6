package gr.aueb.cf.ch6;


    import java.util.Arrays;

    public class ShallowDeepCopyApp {
        public static void main(String[] args) {
            int [][] grid = {{1,2,3}, {4,5,6}};
            int [][] gridCopyref = copyReference(grid);
            gridCopyref[0] [0] = 100;
            traverse(grid);

            int[][] gridDeepCopy = deepCopy(grid);
            gridDeepCopy[0][0] = 200;
            traverse(grid);
        }
        public static int[][] copyReference(int [][] arr){
            return arr;
        }

        public static int [] [] shallowCopy (int[][]arr){
            return Arrays.copyOf(arr,arr.length);
        }

        public static void traverse (int[][]arr){
            for(int[] row: arr){
                for(int col:row){
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
        public static int[][] deepCopy(int[][]arr){
            int [][] arrayToReturn = new int [arr.length][];

            for (int i=0; i< arr.length; i++){
                arrayToReturn[i] = new int [arr[i].length];

                arrayToReturn[i] =Arrays.copyOf(arr[i], arr[i].length);
            }
            return arrayToReturn;
        }
    }

