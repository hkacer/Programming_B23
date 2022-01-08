package day16_String2;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter your sentence:");
        String name= scan.nextLine();// index number -3 will give you last 3 characters

        String res= (name.length()==0)? "String is empty":( name.length()>3)? name.substring(name.length()-3): name;
        System.out.println(res);
        /*
        if( name.length()>3){

            System.out.println(name.substring(name.length()-3));

        }else if( name.length()==0){

            System.out.println(" String is Empty ");
        }else{

            System.out.println(name);

        }
        */



        scan.close();











    }
}
