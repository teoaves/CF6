package gr.aueb.cf.ch5;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        swap(a, b);
        System.out.printf("a=%d, b=%d", a, b);


    }

        public static void swap(int a, int b) {
            int tmp=a;
            a=b;
            b=tmp;



        }
    }

