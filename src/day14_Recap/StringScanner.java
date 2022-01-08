package day14_Recap;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" Please enter your height");
        double height= scan.nextDouble();

        System.out.println(" Enter your Shoe size");
        int shoe= scan.nextInt();

        System.out.println(" Do you like to wear hats");
        boolean hats= scan.nextBoolean();

        System.out.println(" Enter your birth year");
        int year= scan.nextInt();

        System.out.println(" Enter your month number");
        int month= scan.nextInt();

        System.out.println(" Enter your birth day");
        int day= scan.nextInt();
        boolean isValid= (year>=0 && year<=2021)&& (month>=1 && month<=12)&& (day>=1 && day<=31);
        if (isValid){
            System.out.println(month+"/"+day+"/"+year+" is your birthday!");
        }else {
            System.out.println(" Invalid Entry");
        }

        scan.nextLine();
        System.out.println(" Enter your birth city");
        String city= scan.nextLine();

        System.out.println(" Enter your zipcode");
        long zip= scan.nextLong();

        System.out.println(" how many people do you live with");
        byte people= scan.nextByte();

        System.out.println(" Are you married?");
        boolean married= scan.nextBoolean();

        System.out.println(+ height+" , "+ shoe+ " , "+ hats);

        System.out.println(" I see you are not "+( (married)?"Married":"Not Married")+"and live with "+ people+ " people in your house" +
                "which is in the "+ zip+" area!");


        scan.close();

    }

}
