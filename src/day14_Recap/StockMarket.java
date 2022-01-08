package day14_Recap;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" How many total shares you have already");
        int shares= scan.nextInt();

        if (shares>=0){
            System.out.println(" You can continue to put info");
            System.out.println(" How much your total value in the stock market is");
            int value= scan.nextInt();

            scan.nextLine();
            System.out.println(" Enter the name of the company the most shares in");
            String nameCompany= scan.nextLine();
            System.out.println(" Your total stock market holding is $"+value+" " +
                    "which is made up of "+shares+ " shares. "+ nameCompany+" is your company holdings.");
        }else {
            System.out.println(" Invalid information");

        }


        scan.close();













    }
}
