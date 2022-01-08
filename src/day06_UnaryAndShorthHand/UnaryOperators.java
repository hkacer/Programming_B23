package day06_UnaryAndShorthHand;

public class UnaryOperators {

    public static void main(String[] args) {

        int a= 100;
        ++a;// ++ before the variable= pre
        a++;// ++ after the variable= post

        System.out.println(a);
        System.out.println("a = " + a);

        int b= 100;

        --b;// -- before the variable= pre
        b++;// -- after the variable= post

        System.out.println(b);
        System.out.println("b = " + b);


        System.out.println("----------------------");

        int x= 10;
        //System.out.println(++x);// pre: increase the value by 1 right away immediatelly

        System.out.println( x++);// post: 10 will get first, then the change the value by 1
        System.out.println("x = " + x);

        System.out.println("-----------------------");

        int n1= 50;

        int n2= n1++;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int a1= 100;
        int a2= ++a1;

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println("==================");

        int r= 200;

        System.out.println(r++);

        System.out.println("r = " + r);

        int p= 300;
        System.out.println(p++);
        System.out.println("p = " + p);
        System.out.println("================================");

        int y= 100;
        int result= y+++1;
        System.out.println("result = " + result);
        System.out.println("y = " + y);

        int z= 100;
        int result2= ++z+1;
        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);

        int c= 1;
        int f= -a--+ a++/-a--*--a;
        System.out.println("c = " + c);
        System.out.println("f = " + f);





















    }















}
