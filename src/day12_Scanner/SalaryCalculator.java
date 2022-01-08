package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your HourlyRate");

        double hourlyRate= input.nextDouble();
        System.out.println("Hours");

        int hours= input.nextInt();
        System.out.println("Weeks");

        int weeks= input.nextInt();
        System.out.println("Your Salary is: ");
        double res= hourlyRate*hours*weeks;
        System.out.println("You are making $ " + res+" per hour");
        System.out.println("You work " + weeks+" in a wek");





    }
}
