package day08_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        // grade; A= 90<= score>=100
        //        B= 80<= score>=
        int score= 55;

        if ( score>=90 && score<=100) {
            System.out.println(" Excellent you made an A");
        }

        if ( score >=80 && score<= 89) {
            System.out.println(" You made B");

        }
        if ( score>=70 && score<= 79) {
            System.out.println(" You made C");

        }

        if ( score>=60 && score<= 69){
            System.out.println(" you made D");

        }

        if ( score<60){
            System.out.println(" You made F");
        }




    }
}
