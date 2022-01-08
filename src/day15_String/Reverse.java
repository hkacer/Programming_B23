package day15_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter your character");

        String character= scan.next();
        int totalNum= character.length();
        String res=" ";// lets say it is uncle


        if( totalNum>5){
            System.out.println(" Too Long!");
        }else if(totalNum<5){
            System.out.println(" Too Short!");
        } else{
           /* res+= ""+ character.charAt(4);// if you concate something it eill let you.
            res+= character.charAt(3);
            res+= character.charAt(2);
            res+= character.charAt(1);
            res+= character.charAt(0);*/
            res= ""+ character.charAt(4)+character.charAt(3)+character.charAt(2)+character.charAt(1)+character.charAt(0);
            //                 e              l                      c               n                            u
        }

        System.out.println("res = " + res);





    }
}
