package day12_Scanner;

public class Grades {
    public static void main(String[] args) {
        char grade= 'A';
        String res= "";


        switch (grade){
            case 'A':
                //System.out.println("Excellent");
                res= "Excellent";
                break;

            case 'B':
               // System.out.println("Great Job"); I did this way
                res="Great Job"; // using variable it is much more easy
                break;

            case 'C':
                //System.out.println("Good");
                res= "Good";
                break;

            case 'D':
               // System.out.println("Passed");
                res= "Passed";
                break;

            case 'F':
                //System.out.println("Failed");
                res= "Failed";
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println("res = " + res);









    }
}
