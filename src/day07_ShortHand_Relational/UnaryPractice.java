package day07_ShortHand_Relational;

public class UnaryPractice {

    public static void main(String[] args) {

        int a= 100;
        int b= -a++ + ++a - a-- * a-- %2;
           //  -100 + 102 - 102 *101 %2
           // -100 + 102 - 10302 % 2
        //    -100 +102 -0
        //     2
        System.out.println("a = " + a);

        System.out.println("b = " + b);

        int c= 10;
        System.out.println(c--);
        System.out.println("c = " + c);















    }














}
