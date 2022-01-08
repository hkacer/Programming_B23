package day17_String;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String user1="Cybertek@gmail.com";
        String pass1="Cybertek123";

        System.out.println(" Enter your  username");
        String user= scan.next();

        System.out.println("Enter your password");
        String pass=scan.next();
        //boolean login= user.equalsIgnoreCase(user1)&& pass.equals(pass1);

        if(user.equals(user1) || user.equalsIgnoreCase(user1)&& pass.equals(pass1)){
            System.out.println(" Logged in Successfully");

        }else {
            System.out.println("Invalid username or password.");
        }


        scan.close();












    }
}
