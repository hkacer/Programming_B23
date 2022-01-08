package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the product name");
        String product= scan.nextLine();

        System.out.println("Enter the price");
        double price= scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity= scan.nextInt();
        double fullPrice= price*quantity;

        scan.nextLine();
        System.out.println(" Enter your  full name");
        String name= scan.nextLine();


        System.out.println(name+" , Your order for "+ quantity+" Apples has been placed. Your total is: " + fullPrice +".");

        scan.close(); // highly recommended closing the scanner. you cannot use scanner anymore.
        // you have to recreate again. You should not create scanner again in one program.






    }
}
