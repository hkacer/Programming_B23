package day13_Scanner2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println(" Put your number here:");

        double mile= 1.609;
        double km= input.nextDouble();
        System.out.println(" mile is : ");
        System.out.println("km = " + km*mile);







    }
}
