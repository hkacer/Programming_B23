package day05_ArithmeticOperators;

public class ArithmeticsPractice {

    public static void main(String[] args) {

      int number= 15;
      double ttl= number/2;
      double rem= number%3;

      boolean isEven= number%3==0; // == is equal operator

        System.out.println(number+" is evenly divisible by 3: " +isEven+ " " +
                " \n it is remainder "+ rem);


        boolean isEvenlyBy5= number%5==0; // if the remainder of number divided by 5 is 0 then it is evenly divide.

        System.out.println(number+ " is evenly divisible by 5: "+ isEvenlyBy5);















    }





}
