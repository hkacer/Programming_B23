package day08_ifStatements;

public class PostNegZero {
    public static void main(String[] args) {

        int number= 1000;

        boolean pos= number>0;
        boolean neg= number<0;
        boolean zero= !pos && !neg;

        if (pos){
            System.out.println(number+ "  is positive");


        }
        if ( neg){
            System.out.println(number+ " the number is negative");
        }

        if ( zero){
            System.out.println(number+" is zero");

        }










    }
}
