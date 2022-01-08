package day05_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {

       // odd number= cannot be evenly divisible by 2. It will be a remainder. 11/2=5.5
       // even number=  evenly divisible by 2. it will be no remainder. 12/6=2.0
        // >greater, < smaller, == equal operator

        int number= 303;
        int rem= number%2;

        boolean isEven= number%3==0; //if the remainder of number divided by 2 equal to zero, then it is even.

        boolean isOdd= number%3>0; // if the remainder of number divided by 2 greater than 0, then it is odd.

        System.out.println(number+ " is even number= " + isEven+
                "\n " + number+" is odd number= "+ isOdd);














    }











}
