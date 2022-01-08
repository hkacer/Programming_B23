package day08_ifStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name= "James";
        int age= 34;
        String citizen= "USA";
        boolean eligible= age>= 21 && citizen=="USA";
        boolean notEligible= !eligible;

        if ( eligible){
            System.out.println(name+ "eligible to vote ");


        }

        if ( notEligible) {
            System.out.println(name+ " is not Eligible to vote  " );

        }






    }






}
