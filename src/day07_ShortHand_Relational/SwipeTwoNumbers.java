package day07_ShortHand_Relational;

public class SwipeTwoNumbers {
    public static void main(String[] args) {

        int a= 200;
        int b= 300;
        int c= a;
        a=b; //
        b=c;



        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        int d= 100;// -100+1=101+1= 102+
        int e= -d++ + ++d -d-- * d-- %2;
           //  -100 + 102 - 102* 101%2
        System.out.println("e = " + e);
















    }














}
