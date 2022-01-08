package day16_String2;

import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter 3 words");

        String w1= scan.next();
        String w2= scan.next();
        String w3=scan.next();

        boolean allSame= w1.length() == w2.length() && w1.length()==w3.length();
        boolean notSame= w1.length()!=w2.length() && w1.length()!=w3.length()&& w2.length()!=w3.length();


        // a=b && a=c, b=c
        if(allSame){
            System.out.println(" All words are the same length");


        }else if( notSame){
            System.out.println("All different length ");
        }else {
            System.out.println(" Not same or Different Length");
        }
        scan.close();















    }
}
