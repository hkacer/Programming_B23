package day17_String;


import java.util.Scanner;

public class GmailValid {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println(" Please put your email address:");
        //String gmail= "Cybertek@gmail.com"; This is the another way to check
       // String domain= gmail.substring(gmail.indexOf("@"));
       // boolean isValid= domain.equals("@gmail.com");
        String email= scan.nextLine();
        boolean emailVerify=email.contains("@gmail.com");

        if(emailVerify==true){
            System.out.println(" You entered valid email");
        }else {
            System.out.println("Your email address does not match with us");
        }
        System.out.println("=================================");
        System.out.println("Put your web address");
        String email2= scan.nextLine();
        String url= " www.amazon.com";
        boolean startsWithWww= email2.startsWith("www.")&& email2.endsWith(".com")||email2.endsWith(".edu")||email2.endsWith(".gov");

        if(startsWithWww==true){
            System.out.println("You entered the valid website");

        }else {
            System.out.println("It is not correct web address");
        }

        System.out.println("==================");
        System.out.println(" Enter a word:");
        String word= scan.next();
        boolean wordsEndsWith= word.endsWith("ly");
        //boolean ends= word.substring(word.length()-2).equals("ly");
        // this is the another way to create this expression

        if(wordsEndsWith==true){
            System.out.println("Really");
        }else{
            System.out.println("never mind");
        }










        scan.close();





    }
}
