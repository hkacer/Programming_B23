package day03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyrate = 60;
        int weeklyrate = 50;
        int numberofweeksinayear = 48;
        int salary = hourlyrate *weeklyrate * numberofweeksinayear;

        System.out.println(salary);

        double taxRate = 0.24;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary -totalTax;

        System.out.println(salaryAfterTax);









    }










}
