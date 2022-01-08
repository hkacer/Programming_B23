package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n1= 100;
        if (n1>0){
            System.out.println(n1+" Positive");
        } else  if ( n1<0){
            System.out.println(n1+"Negative");
        } else {
            System.out.println(n1+"zero");
        }

        System.out.println("================================");
        // In the below compiler has to check each IF conditions and this is not wanted
        // you need to find the best way or better performance to express your code
        /*if( n1>0){
        System.out.println(n1+ " positive");
        }
       // if ( n1<0){
            System.out.println(" negative");
        } //else{
            System.out.println("zero");
        }
        */

















    }



}
