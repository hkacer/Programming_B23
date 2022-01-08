package day13_Scanner2;

import java.util.Scanner;

public class NextString {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    // next()= returns string, ONLY takes the first word
        // nextLine= returns string
        System.out.println(" Enter your name");
        String firstName= scan.next();

        System.out.println("name = " + firstName); // it only shows first word. If you put your name it will show your name inly.
        System.out.println(" Enter your last name");

        String lastName= scan.next();
        String fullName= firstName+ " "+ lastName;
        System.out.println("fullName = " + fullName);


        System.out.println(" Put your number of your street");
        String streetNum= scan.next();

        System.out.println("street = " + streetNum);


        System.out.println(" Put your number your street");
        String street= scan.next();

        String streetFull= streetNum+" " + street;
        System.out.println("streetFull = " + streetFull);












    }
}
