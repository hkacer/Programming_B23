package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score= 130; // 0~100 all conditions depends on this
        String grade= "";

        if ( score>=0 && score<=100){

            // pre condition= is the score valid
            // statement 1 must be TRUE!!

            if (score>=90){

                // 1st statement must be TRUE to be able to executed
                grade="A";
            }else if( score>=80){
                grade= "B";

            }else if( score>=70){
                grade= "C";

            }else if( score>=60){
                grade= "D";

            }else {
                grade= "F";

            }
        } else {// opposite of pre condition= if the score is invalid
            grade= " Invalid";

        }
        System.out.println("grade = " + grade);







    }
}
