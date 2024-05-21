package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int positionofNextO = s.indexOf( 'o',2);
        System.out.println("position of o:" + positionOfo);
        System.out.println("position of next o : "+ positionofNextO);

        String odToEnd = s.substring(4);
        System.out.println(odToEnd);

        String od = s.substring(1,3);
        System.out.println(od);
    }
}

