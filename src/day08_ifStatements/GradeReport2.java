package day08_ifStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score= 95;

        boolean madeA= score>=90 && score<=100;
        boolean madeB= !madeA && score>=80; // did not make A but score is grater than 80
        boolean madeC= !madeA && !madeB && score>=70; // did not make A or B but score is more than 70
        boolean madeD= !madeA && !madeB && !madeC && score>=60;
        boolean madeF= !madeD && !madeA && !madeB && !madeC && score<60;

        if ( madeA){
            System.out.println("Excellent you made an A");
        }
        if (madeB){
            System.out.println("Excellent you made an B");
        }
        if ( madeC) {
            System.out.println("Excellent you made an C");
        }
        if ( madeD) {
            System.out.println("Excellent you made an D");
        }
        if ( madeF){
            System.out.println("You Failed");
        }

    }



}
