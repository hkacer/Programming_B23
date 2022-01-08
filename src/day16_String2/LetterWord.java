package day16_String2;

import java.util.Scanner;

public class LetterWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter a Three letter word:");

        String word1= scan.next();
        String result="";

        if(word1.length()==3){

            if( word1.charAt(1)=='a'){
                result= "Cool Word.";

            }else
                result= " Okay word!";

        }else{
            if (word1.length()<3){
                result=" Word is too short!";
            }else{
                result= "Word is too long!";
            }

        }
        System.out.println("result = " + result);

        scan.close();






    }
}
