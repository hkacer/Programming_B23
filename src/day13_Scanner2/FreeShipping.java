package day13_Scanner2;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the price of item");
        double price= scan.nextDouble();

        System.out.println(" Are you a prime member");
        boolean prime= scan.nextBoolean();

        double totalCost= (prime)? price : (price>=25)?price: price +3.99;
        System.out.println("totalCost = $ " + totalCost);
















    }
}
