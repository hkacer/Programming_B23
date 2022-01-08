package day06_UnaryAndShorthHand;

import javax.lang.model.SourceVersion;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a=10;
        long b= a; // implicit casting done automatically. Smaller to larger

        double d= 10.0;

        int f= (int)(long)d; // explicit casting done manually. Larger to smaller


        long n= 100;
        short m= (short)n; // always use data type that you gave it to variable. It will be more easy and always accurate

        float q= 2.5f;
        int w= (int) q;

        long r= (long)q;

        short s= (short) q;

        System.out.println((double) 2.5f);
        System.out.println( (double) 10L);


        int t= 129;
        byte z= (byte) t;

        System.out.println("z = " + z);; // it gives negative number because it is out of range

        int e= 70000;
        short g= (short) e;
        System.out.println("g = " + g); // you will not get the same number because it is out of range
        System.out.println("-----------------------");

        double num1= 1000.0;
         int num2= (int) num1; //explicit casting
        System.out.println("num2 = " + num2);// 1000
        System.out.println("num1 = " + num1);// 1000.0

        System.out.println((int)100.23456); // 100 only takes number int

        DecimalFormat df= new DecimalFormat("0.00");
       // System.out.println(df.format (1.5678912345);

        //+ unary plus operator= greater than 0 10+20= 30
        // - unary minus operator= less than 0 -10+20= 10
        // ++ increment operator= increase the value by 1
        // -- decrement operator= decrease the value by 1


































    }















}
