package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int num=0;
    String inputStr="";

    System.out.println("Please insert an int");
    inputStr=in.nextLine();
    if(isInt(inputStr)) {
        num=Integer.parseInt(inputStr);
        System.out.println("num" +num);
    }else {
        System.out.println("error in parsing, plase insert an int");
    }


     }



   public static boolean isInt(String s){
        try{
        Integer.parseInt(s);
        return true;
        }catch(java.lang.NumberFormatException e){
        return false;
        }
    }
}
