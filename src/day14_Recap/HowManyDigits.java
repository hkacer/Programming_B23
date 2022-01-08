package day14_Recap;

public class HowManyDigits {
    public static void main(String[] args) {

        int num= 3499;
        String res= " ";

        if ( num>=1 && num<=10000){
            if(num>=100 && num<=999){
                //System.out.println("3 Digits");\
                res= "3 Digits";

            }else if( num>=10 && num<=99){
                res= "2 Digits";

            }else if(num>=1 && num<=9){
                res= "One digit";

            }else if(num>=1000 && num<=10000){
                res= "five digit";

            }else
                res= "Invalid Number";


        }else {
            res= "Invalid number";
        }
        System.out.println("res = " + res);











    }
}
