package day13_Scanner2;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" You are full time employee");
         boolean siFullTime= scan.nextBoolean();

        System.out.println("You are an adult");
        boolean adult= scan.nextBoolean();

        System.out.println("You are married");
        boolean isMarried= scan.nextBoolean();


        System.out.println("siFullTime = " + siFullTime);
        System.out.println("adult = " + adult);
        System.out.println("isMarried = " + isMarried);







    }
}
