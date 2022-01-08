package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name= " Hatice Kacer";
        int age= 30;
        int creditScore= 700;
        double income= 60_000;
        int workHistory= 2;

        boolean eligibleForLoan= age>=18 && creditScore>=700 && income>=50000 && workHistory>=2;

        System.out.println(name+ " is eligible For Loan = " + eligibleForLoan);
        /*
        boolean r1= income>= 60000 && workHistory >=2;
        boolean r2= age>= 18 && creditScore>=700;
        boolean isEligible= r1 && r2;

         */





















    }
















}
