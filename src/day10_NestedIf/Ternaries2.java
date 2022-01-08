package day10_NestedIf;

public class Ternaries2 {
    public static void main(String[] args) {
        int num=10;
        String res= "";

       String res2=  ( num>0)? "Positive":(num<0)?  "Negative": "Zero";
        System.out.println("res2 = " + res2);
        System.out.println("=============================");

        int score= 10;
        char grade= ' ';

        char grade2= (score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C'
                :( score>=60)? 'C':'F';
        System.out.println("grade2 = " + grade2);

















    }
}
