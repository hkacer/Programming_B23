package day10_NestedIf;

public class CalculateSalary {
    public static void main(String[] args) {
        String name = "Kacer";

        double salary = 100_000;
        double taxRate = 0;


        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else
            taxRate = 0.20;

        boolean married= false; // if person is married
        if (married){
            taxRate -= 0.05;// tax rate will be substracted by 5
        }
        double salaryAfterTax= salary-(salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }



}





