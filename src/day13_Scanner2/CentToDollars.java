package day13_Scanner2;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println(" Put your money amount");

        int cent= input.nextInt();
        int dol= cent/100;
        int remainder= cent%100;

        if (cent>=0) {// if the input is valid

            if (remainder == 0) {
                System.out.println(cent + " is equal to " + dol + " dollars");
            } else {
                System.out.println(cent + " cents equal to " + dol + " dollars and " + remainder + " cents");
            }
        }else { // if input is invalid
            System.err.println("Invalid Amount");
        }




    }
}
