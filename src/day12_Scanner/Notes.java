package day12_Scanner;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        /* Scanner used for : to get user info

        //scanner class= import java.util.Scanner;
        // keyword is import
        // and you will give package name= java.util
        // and class name Scanner
        // syntax of import statement:
        // import java.util.Scanner;
        you need to create object.

        Scanner variableName= new Scanner(System.in);

         */

        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int add= num1+num2;
        int subs= num1-num2;
        int multp= num1*num2;
        int div= num1/num2;
        System.out.println("add = " + add);
        System.out.println("subs = " + subs);
        System.out.println("multp = " + multp);
        System.out.println("div = " + div);













    }
}
