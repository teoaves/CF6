package gr.aueb.cf.ch7;

public class gianadw {

        public static void main(String[] args) {
            String myString = "Hello, World!";
            String reversedString = "";
            for (int i = myString.length() - 1; i >= 0; i--) {
                reversedString += myString.charAt(i);
            }
            System.out.println(reversedString);
        }
    }
