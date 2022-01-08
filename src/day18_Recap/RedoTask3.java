package day18_Recap;

import java.util.Scanner;

public class RedoTask3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();

        if(word.toLowerCase().charAt(0)>='a'&& word.charAt(0)<='z'){
            System.out.println("First character is a lower case");
        }else if(word.toLowerCase().charAt(0)>='A' && word.charAt(0)<='Z'){
            System.out.println("First character is a upper case letter");
        }else if(word.charAt(0)>='0'&& word.charAt(0)<='9'){
            System.out.println("First character is a number");
        }else{
            System.out.println("first character is a special character");
        }











    }
}
