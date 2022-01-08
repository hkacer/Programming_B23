package day18_Recap;

import java.util.Scanner;

public class RedoTask2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String w1= scan.next();//one
        System.out.println("Enter another word");
        String w2= scan.next();// eight==> oneight

        String res= w1.toLowerCase().length()-1+""+ w2.toLowerCase().charAt(0);

        if(w1.toLowerCase().charAt(w1.length()-1)==w2.toLowerCase().charAt(0)){
            System.out.println(w1+w2.substring(1));

        }else{
            System.out.println(w1+w2);
        }

















    }
}
