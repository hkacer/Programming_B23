package day12_Scanner;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter a number");

        int num= input.nextInt();

        if ( num>=1 && num<=12){
            if( num==1){
                System.out.println("Jan");

            }else if( num==2){
                System.out.println("Feb");
            }else if( num==3){
                System.out.println("Mar");
            }else if( num==4){
                System.out.println("Apr");
            }else if( num==5){
                System.out.println("May");
            }else if( num==6){
                System.out.println("Jun");
            }else if( num==7){
                System.out.println("Jul");
            }else if( num==8){
                System.out.println("Aug");
            }else if( num==9){
                System.out.println("Sep");
            }else if( num==10){
                System.out.println("Oct");
            }else if( num==11){
                System.out.println("Nov");
            }else{
                System.out.println("Dec");
            }

        }else{
            System.out.println("Invalid Number");
        }






    }
}
