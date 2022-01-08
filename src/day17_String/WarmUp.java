package day17_String;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter your account number:");
        String account= scan.next();

        if(account.length()==2 || account.length()==7){ // if the first character is 2 than it has 7 number
           if( account.charAt(0)=='2' && account.length()==10){
               System.out.println("Valid Account");
           }else if(account.charAt(0)=='5' && account.length()==7){ // if the first character is 5 then it has 10 number
               System.out.println("Valid Account");
           }else{
               System.out.println("Invalid");
           }
        } else{
            System.out.println(" Invalid Account");
        }
        scan.close();














    }
}
