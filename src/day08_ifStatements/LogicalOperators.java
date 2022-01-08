package day08_ifStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println( !true); // false
        System.out.println(!false); //true
        System.out.println(true==!false); //true !=false
        System.out.println(true!= !true);


        System.out.println("============================");

        int score= 80;
        boolean pass= score >=60;
        boolean fail= !pass;

        System.out.println("pass = " + pass);
        System.out.println("fail = " + fail);

        int age= 21;
        boolean eligible= age>=21;
        boolean notEligible= !eligible;

        System.out.println("notEligible = " + notEligible);
        System.out.println("eligible = " + eligible);

        // logical operators only applicable for BOOLEAN....











    }











}
