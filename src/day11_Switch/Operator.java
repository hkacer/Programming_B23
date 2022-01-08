package day11_Switch;

public class Operator {
    public static void main(String[] args) {


        double n1=100;
        double n2= 2.5;
        double res= 0;

        char mathOperator= '&'; //+.*,/,-

        switch (mathOperator){
            case '+':
                //System.out.println(n1+n2);
                res=n1+n2;
                break; // used for exiting the switch

            case '-':
                //System.out.println(n1-n2);
                res= n1-n2;
                break;

            case '*':
                //System.out.println(n1*n2);
                res= n1*n2;
                break;

            case '/':
                //System.out.println(n1/n2);
                res=n1/n2;

                break;

            default:
                System.err.println("Invalid");

        }
        System.out.println("res = " + res); // print after the switch















    }
}
