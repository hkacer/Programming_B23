package day08_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

      int n1= 100;
      boolean odd= n1%2!=0;
      boolean even= !odd;

      if ( odd){// if the number is odd number
          System.out.println("odd = " + odd);

      }
      if ( even){ //if number is not odd number
          System.out.println("is even number= " + even);

      }






    }


}
