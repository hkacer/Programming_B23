package day05_ArithmeticOperators;

public class ArithmeticOperator {

    public static void main(String[] args) {

        System.out.println(25/2);
        System.out.println(25.0/2);
        System.out.println(25/2.0);
        System.out.println(25d/2);
        System.out.println(25/2d);

        System.out.println(10/1);

        double a= 100.0/3; //  33.3333....
        System.out.println("a = " + a);

        double b= 100/3; // 33.333.. or 33 or 33.0
        //     b= 33=== b= 33.0
        System.out.println("b = " + b);

        double c= 100.0/3;
        System.out.println("c = " + c);

        System.out.println("------------------------");

        int n1=100;
        int n2= 40;
        // 100/40= 2 in math

        System.out.println(n1%n2); //20

        int n3= 30;
        int n4=7;

        System.out.println(30%7);

        int n5= 10;
        int n6= 6;
        double ttl= 10/6;
        System.out.println(n5%n6);
        double rem= n5%n6;

        System.out.println(n5+ " divide by "+ n6+ " is equal to "+ ttl+" with a remainder of " +rem);










    }





}
