package day14_Recap;

public class Letter {
    public static void main(String[] args) {
        char letter= '0';

        boolean isDigit= letter>='0' && letter<='9'; // if char is between these num, it is digit

        boolean isLetter= (letter>='A' && letter<='Z')|| (letter>='a' && letter<='z');
        // in between these numbers
        boolean isSpecial= !isDigit && isLetter;

        /*
        String result= " ";


        if( isDigit){
            //System.out.println("Digit");
            result= "Digit";
        }else if(isLetter){
            //System.out.println("Letter");
            result= "Letter";
        }else{
            //System.out.println("Special Character");
            result= "Special char";
        }
        System.out.println("result = " + result);
        */

        String res= (isDigit)? letter+ " Digit": ( isLetter)? letter+ "Letter":letter+"Special";









    }
}
