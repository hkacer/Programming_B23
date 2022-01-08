package day15_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter a word");

        String word1= scan.nextLine();
        int totalnumber= word1.length();

        System.out.println("Enter your second word");
        String word2= scan.nextLine();
        int totalNumber2= word2.length();

        if (totalnumber>totalNumber2){
            System.out.println("word1 = " + word1);

        }else if ( totalNumber2>totalnumber){
            System.out.println("word2 = " + word2);
        }else{
            System.out.println(" Invalid entry");
        }
        scan.close();













    }
}
