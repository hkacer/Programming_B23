package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");

        int num= input.nextInt();

        if( num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println( (num>0)?"Positive":(num<0)?"Negative":"Zero");
    }
}
