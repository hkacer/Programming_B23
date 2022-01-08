package day14_Recap;

import java.util.Scanner;

public class SchoolType {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" Please put your grade level");
        int grade= scan.nextInt();
        String res= "";

        if( grade>=1 && grade<=18){
            if( grade>=1 && grade<=5){
                //System.out.println(" Elementary School");
                res= "Elementary";
            }else if( grade<=8){
                //System.out.println(" Middle School");
                res= "Middle School";
            }else if( grade<=12){
                //System.out.println(" High School");
                res= " High School";
            }else if( grade<=16){
                //System.out.println(" College");
                res= "College";
            }else {
                //System.out.println(" Grad School");
                res= " Grad School";
            }

        } else {
            //System.out.println("Invalid grade level");
            res= "Invalid grade level";
        }
        System.out.println("School Type is = " + res);

        scan.close();










    }
}
