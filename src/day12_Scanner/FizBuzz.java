package day12_Scanner;

public class FizBuzz {
    public static void main(String[] args) {

        //1~10
        int n1= 7;
        String res= "";

        switch (n1){
            case 1:
                //System.out.println("One");
                res= "One";
                break;
            case 2:
               // System.out.println("two");
                res= "two";
                break;
            case 4:
                //System.out.println("four");
                res= "four";
                break;
            case 7:
                //System.out.println("seven");
                res= "seven";
                break;
            case 8:
                //System.out.println("eight");
                res= "eight";
                break;

            case 3:
            case 6:
            case 9:
                //System.out.println("Fizz");
                res= "Fizz";
                break;

            case 5:
            case 10:
                //System.out.println("Buzz");
                res= "Buzz";
                break;

            default:
                System.out.println("Invalid number");
        }

        System.out.println("res = " + res);











    }
}
