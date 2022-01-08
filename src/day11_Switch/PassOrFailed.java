package day11_Switch;

public class PassOrFailed {
    public static void main(String[] args) {


        char grade= 'C';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case  'D':
                System.out.println(" Passed");
                break;
            case  'F':
                System.out.println("Failed");
            default:
                System.out.println("Invalid");



        }













    }
}
