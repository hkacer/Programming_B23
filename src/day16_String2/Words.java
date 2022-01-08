package day16_String2;

import java.util.Locale;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter two words ");
        String word1= scan.next();// apple
        String word2= scan.next();// banana

        String res= word1.substring(1)+ word2.substring(1);
        System.out.println("res = " + res);







    }
}
