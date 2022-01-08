package day13_Scanner2;

import java.util.Scanner;

public class NextMethodDisAd {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter your age");// whwn you click enter after the age numbers

        // enter key will left in the scanner memory and it will not let you put any info
        //
        int age= scan.nextInt();


        scan.nextLine();// you have to call next line method, so you can clear up all enter keys
        System.out.println("Enter your job title");
         String job= scan.nextLine(); // asigned to job by default which is enter

        System.out.println("age = " + age);
        System.out.println("job = " + job);












    }
}
