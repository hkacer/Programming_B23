package day04_Variables;

public class ConcatenationPractice {

    public static void main(String[] args) {

        // + 2 roles= 1 is concatenation and other one is addition.
        // addition= when you have 2 numbers 10+10= 20
        // "10"+"10"= concatenation= "1010", 1+"10= "110, "2"+3= 23
        //

        String word= "Java";
        System.out.println("My favorite program language is "+word+".");
        System.out.println("-----------------------------");


        int dollar= 100;
        double lira= dollar*8.4;
        double euro= dollar*0.88;
        System.out.println(dollar +" US dollars equals to "+ lira+ " Lira.");
        System.out.println(dollar+ " US dollars equals to " + euro+ " Euro.");

        int a=100;
        int b= 200;
        int addition= a+b;
        int substraction= a-b;
        int multipication= a*b;
        System.out.println(addition+ " addition of this numbers "+ substraction+
                " substraction of this number.");
        System.out.println(a+" + "+b+" = "+addition);
        System.out.println(a+ " - "+b+" = "+ substraction);
        System.out.println(a+" * "+b+ " = " + multipication);

        System.out.println("--------------------------------");



        String name= "John";
        String favoriteBook= "Harry Potter";
        String favoriteMusic= " How to win friends";
        String favoriteSeries= " The Vampire";

        System.out.println("\t Hello my name is "+ name+ ". " + "My favorite book is \""+ favoriteBook+ "\". "+
                "My favorite music is \""+ favoriteMusic+"\". " +
                 "My favorite series is \""+ favoriteSeries+"\". ");

        System.out.println("-------------------------------------");

        String today= "Monday";

        String todayClass= "Java";
        String tomorrow= "Tuesday";
        String tomorrowClass= "Selenium";

        // Today is monday and we have Java. Tomorrow is Tuesday and we have Selenium.
        System.out.println("Today is "+ today+ " and we have \""+ todayClass+
                "\". "+ " Tomorrow is " + tomorrow+ " and we have \""+ tomorrowClass+ "\". ");

















    }







}
