package day07_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {

        // >= greater, >= greater or equal,
        System.out.println(  10 >11); // false
        System.out.println( 10>= 10); // true
        System.out.println( 11>= 10); // true
        System.out.println(  20>=200);// false

        // OR logic means either. If one condition is true then it is =true
        // if both conditions are false = false
        // AND logic= to vote; you have to be citizen and 18+ years old
        // if both conditions are true= true
        // if at least one condition is false= false

        // <: less than, <=

        System.out.println( 1000< 100); // false
        System.out.println(1000<10000); // true
        System.out.println(99<= 99); // true



        System.out.println("---------------------");
        // == equal, != not equal
        System.out.println(5==6); // false
        System.out.println(5 !=6); // true

        System.out.println('a'=='A'); //false
        System.out.println('a'!='A');// true

        System.out.println("Java"  == "java");// false not equal
        System.out.println(" Java"!= "java");// true not equal























    }















}
