package day13_Scanner2;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter your building number");
        int num= scan.nextInt();;

        scan.nextLine();
        System.out.println(" Enter your street Address");
        String street= scan.nextLine();

        System.out.println(" Enter your city name");
        String city= scan.nextLine();

        System.out.println(" Enter your state");
        String state= scan.next();

        System.out.println(" Enter your zipcode");
        int zip= scan.nextInt();

        scan.nextLine();
        System.out.println(" Enter your full name");
        String fullName= scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("num = " + num);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);
        System.out.println("fullName = " + fullName);












    }
}
