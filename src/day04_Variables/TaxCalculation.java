package day04_Variables;

public class TaxCalculation {

    public static void main(String[] args) {
     int salary= 60000;
     double stateTax= 0;
     double federalTax= 0.21;
     double totalStateTax= salary * stateTax;
     double totalFederalTax= salary * federalTax;
     double salaryAfterTax= salary - totalStateTax - totalFederalTax;

        System.out.println(" Your is $ "+salary);


     // you need to pay totalstatetax to stateTax

        System.out.println(" You need to pay $ "+ totalStateTax + " of total state tax");
        System.out.println(" You need to pay $ "+ totalFederalTax+" total federal tax");
        System.out.println(" Your take home salary is $ "+ salaryAfterTax);












    }





}
