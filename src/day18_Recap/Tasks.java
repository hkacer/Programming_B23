package day18_Recap;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word:");
        String word= scan.next();
        //boolean res= word.startsWith("x");// "Xcode"

        if(word.toLowerCase().startsWith("x")){
            // "xcode" another way of ignoring case sensitivity
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

        String sentence= "I love Java";
        if(sentence.toLowerCase().contains("Java")){
            System.out.println("Has Java");
        }else {
            System.out.println("Has not have Java");
        }
        System.out.println("===========================");
        String s1= "I love cats";
        boolean loveCats= s1.equalsIgnoreCase("cats");// it verifies if s1 is "cats"
        boolean loveCats2= s1.toLowerCase().contains("cats");// verify if the s1 has cats

        System.out.println("===========================");








        scan.close();
    }
}
