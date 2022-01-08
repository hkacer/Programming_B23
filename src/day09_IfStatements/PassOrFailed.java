package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {

        int score= 50;
        if( score>= 60) {
            System.out.println("Passed");
        }

        if ( score<60){
            System.out.println("Failed");
        }


        System.out.println("===============");

        if( score>=60){// else is depending on IF. If there is no IF, you cannot use ELSE
            System.out.println(" Passed");
        } else{ //otherwise
            System.out.println(" Failed");
        }
        // single if; for one condition
        // if else statements= more than 1 condition, but cannot be more than 2.
        System.out.println("======================================");














    }
}
