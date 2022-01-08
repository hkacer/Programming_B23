package day10_NestedIf;

public class EligibleToVote {
    public static void main(String[] args) {
        int age= 21;
        String res= "";

        if (age>=21){
            res= " Eligible";
        }else{
            res= "Not Eligible";
        }
        System.out.println("res = " + res);
        System.out.println("===============================");

       String res2= (age>=21)? "Eligible": "Not Eligible";
        System.out.println("res2 = " + res2);

        int score= 90;
        String res3= "" ;

        String res4=(score>=60)? "PASS": "FAILED";
        System.out.println("res4 = " + res4);


        System.out.println("------------------------");


        int n1= 100;
        String result1= "";





    }





}
