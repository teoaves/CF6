package gr.aueb.cf.ch6;

public class ArrayPopulate {
    public static void main(String[] args) {

        int [] ages = new int[5];

        ages[0] = 20;
        ages[1] = 40;
        ages[2] = 27;
        ages[3] = 17;
        ages[4] = 22;

        for(int i = 0; i< ages.length; i++) {
            System.out.println(ages[i] + " ");
        }

    }
}
