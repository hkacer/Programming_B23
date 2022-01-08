package day18_Recap;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter a word");
        String word= scan.next();
        char f= word.charAt(0);
        String res= "First character is";

        if(f>='0'&& f<='9'){
            res+= "digit";
        }else if(f>='a'&& f<='z'){
            res+= "lower case";
        }else if(f>='A' && f<='Z'){
           res +="upper case";
        }else {
            res +=" special character";
        }








        scan.close();













    }
}
