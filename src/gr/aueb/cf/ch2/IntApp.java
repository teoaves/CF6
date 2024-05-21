package gr.aueb.cf.ch2;

public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type:%s, Size:%d bits , min:%d, max%d \n",
                Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type:%s, Size:%d bits , min:%d, max%d \n",
                Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type:%s, Size:%d bits , min:%d, max%d \n",
                Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type:%s, Size:%d bits , min:%d, max%d",
                Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
