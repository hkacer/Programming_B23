package day14_Recap;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000");
        int num= scan.nextInt();

        if ( num>=1 && num<=100000){
            if (num>=1 && num<=9){
                System.out.println("1 Digit");

            }else if( num<=99){
                System.out.println("2 Digits");

            }else if(  num<=999){
                System.out.println("3 Digits");

            }else if( num<=9999){
                System.out.println("4 Digits");

            }else if( num<=99999){
                System.out.println("5 Digits");
            }else {
                System.out.println("6 Digits");
            }



        }else{
            System.out.println("Invalid Number");
        }
        String result= (num>=1 && num<=999999)?(num<=9)?"1 Didigt": (num<=99)?"2 Digits":
                (num<=999)?"3 Digits":( num<=9999)?"4 Digits":(num<=99999)?"5 Didigts":
                        "6 Digits":"Invalid";





        scan.close();















    }
}
