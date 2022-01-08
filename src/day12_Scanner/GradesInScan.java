package day12_Scanner;

import java.util.Scanner;

public class GradesInScan {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number");

        int num= input.nextInt();

        if( num>=0 && num<=100){
            if( num>=90 && num<=100){
                System.out.println("A");

            }else if( num>=80 &&num<=89){
                System.out.println("B");
            }else if( num>=70 &&num<=79){
                System.out.println("C");
            }else if( num>=60 &&num<=69){
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }else {
            System.out.println("Invalid Grade");
        }



    }
}
