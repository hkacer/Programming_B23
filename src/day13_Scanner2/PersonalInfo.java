package day13_Scanner2;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in); // 2Enters left and the will assgined to console

        System.out.println(" Enter your salary");
         int salary= scan. nextInt(); // 100000enter

        System.out.println(" Enter your gender");
        String gender= scan.next();// maleEnter

        scan.nextLine();  // you have to put nextLine before using the nextLine method.
        System.out.println(" Enter your full name");
        String fullName= scan.nextLine();

        System.out.println(" Enter your job title");
        String job= scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("job = " + job);












    }
}
