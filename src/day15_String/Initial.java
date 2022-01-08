package day15_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Type your name");

       // String name= "Hatice";
       // String name1= scan.nextLine();
        char f= scan.next().charAt(0);

        System.out.println("Type your last name");
       // String last= "Kacer";
       // String last1= scan.nextLine();
        char l= scan.next().charAt(0);

       // char nm= name1.charAt(0);
       // char ls= last1.charAt(0);

        System.out.println("initial = " + f+"."+ l);

        scan.close();









    }
}
