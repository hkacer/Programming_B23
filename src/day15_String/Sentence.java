package day15_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println(" Please enter your sentence");
        String sentence= scan.nextLine();


        char firstchar= sentence.charAt(0);
        int lastindex= sentence.length()-1;
        char lastchar= sentence.charAt(lastindex);


        System.out.println("firstchar = " + firstchar);
        System.out.println("lastchar = " + lastchar);




    }
}
