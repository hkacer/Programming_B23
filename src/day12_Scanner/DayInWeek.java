package day12_Scanner;

import java.util.Scanner;

public class DayInWeek {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");

        int num= input.nextInt();
        String res= "";

        if (num>=1 &&num<=7){
            if (num==1){
                res= "Monday";
                System.out.println("Mon");

            }else if( num==2){
                res= "Tuesday";
                System.out.println("Tue");
            }else if( num==3){
                res= "Wed";
                System.out.println("Wed");

            }else if( num==4){
                res= "Thur";
                System.out.println("Thur");

            }else if( num==5){
                res= "Fri";
                System.out.println("Fri");

            }else if( num==6){
                res= "Sat";
                System.out.println("Sat");

            }else {
                res= "Sun";
                System.out.println("Sun");
            }
        }else {
            System.out.println("Invalid Day ");
        }




    }
}
