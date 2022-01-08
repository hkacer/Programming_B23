package day15_String;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1= scan.nextInt();

        System.out.println("Put your operator");
        char operator= scan.next().charAt(0); // this method returns me string and using charat method
        // char for the single character. + _ ? *


        System.out.println("Enter the second number");
        int num2= scan.nextInt();

        int res= 0;

        switch (operator){
            case '-':
            res= num1-num2;
            break;
            case '+':
                res= num1+num2;
                break;
            case '*':
                res= num1*num2;
                break;
            case '/':
                res=num1/num2;
                break;
            default:
                System.out.println("Invalid Operator");
        }



        System.out.println("res = " + res);








    }
}
