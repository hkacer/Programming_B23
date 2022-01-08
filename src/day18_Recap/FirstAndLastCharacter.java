package day18_Recap;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word");
        String w1= scan.next();// one

        System.out.println("Enter another word:");
        String w2= scan.next();// eight ==> onegiht final output

        /*
        if(w1.charAt(w1.length()-1)==w2.charAt(0)   ){

            // last character of w1== first character of w2
            System.out.println(w1+w2.substring(1));
        }else{
            System.out.println(w1+w2);
        }
        */ // First option

        //if(w1.substring(w1.length()-1).equalsIgnoreCase(""+w2.charAt(0))){
            // w1 last character and ignore case sensitivity add with w2
          //  System.out.println(w1+w2.substring(1));
       // }else {
        //    System.out.println(w1+w2);
      //  } //Second Option

        if (w1.toLowerCase().endsWith(w2.substring(0,1).toLowerCase())){
            System.out.println(w1+w2.substring(1));
        }else {
            System.out.println(w1+w2);
        }




        scan.close();












    }
}
