package day14_Recap;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int num= scan.nextInt();
        String res= " ";

        if (num >= 1) {
            switch (num){
                case (1):
                case (2):
                    res="Live with less than 3 people";
                    break;
                case (3):
                case (4):
                case (5):
                case (6):
                    res= " Live with 3-6 people";
                    break;

                case (7):
                case (8):
                case (9):
                case (10):
                    res=" Live wth more than 6 people";
                    break;

                default:
                    res= " Unknown";


            }


        }


        System.out.println(" You  = " + res);







    }
}
