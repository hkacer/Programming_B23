package day06_UnaryAndShorthHand;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(" Addition "+ 2+ 3);
        //                  Addition: 2'+3

        System.out.println("Addition "+ (2+3));

        System.out.println("--------------------");

        int a= 10;
        int b= 2;
        System.out.println(" Addtition: "+ (a+b));
        System.out.println(" Substraction: "+ (a-b));
        System.out.println(" Multipication: "+ a*b);// do not need grouping because it has high precedence
        System.out.println(" Division: "+ a/b);// do not need grouping because it has high precedence
        System.out.println(" Remainder: "+ a%b);// do not need grouping because it has high precedence


       // 2 types of primitive casting
        // implicit casting= smaller to larger primitive type
        // 3 is int, double a= 3 smaller type can always can be assigned larger type
        // long l= 10L;
        //      l= 10l;
        // it is automatically done

        //  explicit casting: casting larger type to smaller. you have to do it manually
        // double a= 3;
        // int  b= (short)a;








    }










}
