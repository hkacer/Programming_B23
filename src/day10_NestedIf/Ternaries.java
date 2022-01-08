package day10_NestedIf;

public class Ternaries {
    public static void main(String[] args) {
        /*
         shortcut of if statements
         int num= 100;
         String= "";

         if(num%==0){"even"
             result= "Even";
         } else { "0dd"

         }
         String result= (num%2==0) ? "Even': "Odd";

         (condition)? means if keyword
         : means the else keyword
         : (condition)?




         */
        int n= 100;
        String result= "";

        if ( n%2==0){
            result= "Even";
        } else {
             result= "Odd";
        }

        System.out.println("result = " + result);
        System.out.println("==================================");

       String result2=  (n%2==0)? "Even" : "Odd"; // : you have to have : same exact number if ?

        System.out.println("result2 = " + result2);







    }
}
