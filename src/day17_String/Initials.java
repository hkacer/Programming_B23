package day17_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first name");
        String first= scan.next();

        System.out.println("Enter your last name");
        String last= scan.next();

        String res= first.substring(0,1).toUpperCase()+"."+last.substring(0,1).toUpperCase();
        // create substring for first characters of first name and last name, then called uppercase
        // you cannot use charat method because it will return it as a char and you cannot use uppercasemethod
        //Second solution= String res= first.charAt(0)+". "+last.charAt(0);
       // res=res.toUpperCase();
       // third solution= String res= first.toUpperCase().charAt(0)+". "+ last.toUpperCase().charAt(0);


        System.out.println("initial = "+ res);



    scan.close();







    }
}
