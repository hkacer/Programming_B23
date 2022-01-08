package day18_Recap;

public class StringMethods {
    public static void main(String[] args) {
        String str= "abcd";
        int indexOfK=str.indexOf("k");// it will give -1
        System.out.println("indexOfK = " + indexOfK);

        if(indexOfK>=0){
            System.out.println("String has character k");
        }else {
            System.out.println("no character k");
        }

        System.out.println("=============================");

        String sen= " I like to learn C#, C# is cool J";

       if(sen.indexOf("J")>=0){
           // if returns a negative number it means it does not contain that character
           // if returns you 0 or different number it meand that it contains the character
           System.out.println("Sentence has Java");
       }else {
           System.out.println("Sentence does not have java");
       }


        System.out.println("============================");

       String sen2= "I love Java, Java is cool";// unique only occur one time
        //                  7     13
        boolean isUnique= sen2.indexOf("Java")==sen2.lastIndexOf("Java");
        //                         7          ==13  ==> false
        //                         7          == 7 ==> true

        System.out.println("=============================");

        String schoolName= " Cybertek School";
        String name= schoolName.substring(0, schoolName.indexOf(" ")-1);





    }
}
