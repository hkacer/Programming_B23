package day13_Scanner2;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter you job title");

        String job= scan. nextLine(); // one disadvantge is takin everything that you put in your keyboard.
        // even the enter space.

        System.out.println("job = " + job);







    }
}
