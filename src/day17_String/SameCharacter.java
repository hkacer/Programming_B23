package day17_String;

import java.util.Scanner;

public class SameCharacter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String wor= scan.next();
        String first= wor.substring(0, 1);
        String last= wor.substring(wor.length()-1);


        if (first.equalsIgnoreCase(last)){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }


        scan.close();









    }
}
