package day18_Recap;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your email");
        String emailPut= scan.nextLine();

        String email= "hatice_kacer@gmail.com"; // kacer_hatice@....
        int indexof_=email.indexOf("_");// returns the index num of the underscore from the email
        String first= email.substring(0,indexof_);//

        int indexOfAt=email.indexOf("@");// returns the index of @ in email
        String last= email.substring(indexof_+1, indexOfAt);
        String remaining= email.substring(indexOfAt);

        System.out.println("first = " + first);
        System.out.println("last = " + last);
        String res= last+"_"+first+remaining;

        System.out.println(res);


        scan.close();













    }
}
