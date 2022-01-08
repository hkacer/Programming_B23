package day17_String;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first and last name: ");
        String name= scan.nextLine();
        String first= name.substring(0, name.indexOf(" "));
        // when you call substring you can call index number at the same time.
        String last= name.substring(name.indexOf(" ") +1 );

        String res= first.substring(0,1).toUpperCase()+". "+ last.substring(0,1).toUpperCase();



        scan.close();







    }
}
