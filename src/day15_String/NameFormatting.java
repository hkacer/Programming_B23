package day15_String;

import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Put your first name");
        String first= scan.nextLine().trim();
        first= first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // when you give same object to substring and uppercase it will work.
        System.out.println("first = " + first);

        System.out.println(" Enter your last name");
        String last= scan.nextLine().trim();
        last= last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();
        System.out.println("last = " + last);
        String full= first+" "+ last;
        System.out.println("full = " + full);















    }
}
