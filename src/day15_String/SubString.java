package day15_String;

public class SubString {
    public static void main(String[] args) {

        String sentence= "Java Programming Language";
        // index number=  0123 56789
        String name= sentence.substring(0,3+1);// it will give you the name Jav, a is not included
        System.out.println("name = " + name);
        String s2= "Cybertek School";
        //          01234567891011121314
        String name2= s2.substring(0,8);
        System.out.println("name2 = " + name2);
       // String name3= s2.substring(9,15); you can use this for beginning and ending number
        String name3= s2.substring(9);// when you give beginning index it will go until the ending index by default
        System.out.println("name3 = " + name3);

        System.out.println("===========================");

        String sentence2= "Java is a programming language";
        String name4= sentence2.substring(10,21);
        sentence2=sentence2.toUpperCase();
        System.out.println("name4 = " + name4);
        System.out.println("sentence2 = " + sentence2);















    }
}
