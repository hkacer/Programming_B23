package day15_String;

import java.lang.String;// do not need to worry about t this import because compiler will
import java.sql.SQLOutput;
//provide it

public class StringMethods {

    public static void main(String[] args) {

        String str= "Cybertek";// String literal

        String str2= new String("Cybertek");// new keyword

        System.out.println("==============================");

        //Scanner scan= new Scanner(System.in);
        /*
        String class is immutable, it cannot be modified
        by string literal, by new keyword

        String class: presented in " java.lang" it is a special packet. you do not have to provide it
        compiler will provide pre statement

        1. Object. They are 2 ways of creating object
        * String literal= string name = " Daniel"  it will be stored memory called
        string pool. Java heap will be the place everything is saved.
        java heap= it is a memory location in java where all objects will be saved at
        String pool= special memory location, it is only for String literal objects.
        it does not create duplicated objects
        * by using new keyword= string name= new String("Daniel");

        2. String is sequence of characters
        "Cat" 'C' 'a' 't' each character has representative index number. You can manipulate with String using this manipulation
        index number = starting from zero
        String name= " Cybertek 1"; it always starts with left.
         // index      0123456789

        3. String is immutable= you cannot modify the String
        String methods=
        * charAt(index number) = It returns the character at the given number.retrieving certain characters. Provide index number.
        *length()= turns you total number of characters. usually int result.
        * concat method=
        *substring(beginning index, ending index)= creates substring of the string



         */

        String s1= "Cat";
        String s2= "CAt";// it will be different object because java is case-sensitive
        String s3= "Cat"; // one object(cat) will be saved in the String pool.
        System.out.println("s = " + s3+ s2+ s1);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("=================================");

        String s4= new String("Dog");
        String s5= new String("Dog");
        String s6= new String("Dog");// 3 objects created in the java heap.New keyword will create new object
        System.out.println(s4==s5);// they are 2 different rooms and it gives you false
        System.out.println(s5==s6);// it will give you false
        String s7=s4;
        System.out.println(s7==s4);// it will give you true statement
        System.out.println(s4+s5+s6);

        String str1= "Muhtar";
        char ch= str.charAt(0);
        System.out.println("ch = " + ch);

        System.out.println("=========================");

        String word= "Cybertek School";
        //            0123456789

        char ch2= word.charAt(9);
        System.out.println("ch2 = " + ch2);

        String word2= "Java";
        char ch3= word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        String sentence= "Hello everyone, how are you all today?";
        int totalNumber= sentence.length();
        System.out.println("totalNumber = " + totalNumber);

        // characters counting from 1
        String ss1= "Cybertek";
        //index numb 01234567
        int lastIndex= ss1.length()-1;// in order to get last index number you need to subtract 1 from the length.
        char firstCharacter= ss1.charAt(0);
        char lastCharacter= ss1.charAt(lastIndex);
        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("===========================");


        String first= "John";
        String last= "King";
        String full= first+ " "+ last;// this is an easy way to use concat and a lot more readable
        String full2= first.concat(" ").concat(last);
        System.out.println("+===================================");

        String r= "cybertek";
        r=r.toUpperCase();// it will not work when you try to make all of them uppercase
        // you cannot modify the original object, and you have to create new one
        //
        System.out.println("r = " + r);

        String w= "JAVA PROGRAMMING LANGUAGE";
        w = w.toLowerCase();// when you assign this back, you will get lower case
        // you need to create new String by assigning the new variable in the same object
        System.out.println("w = " + w);

        String name= "kacer";
        name=name.toUpperCase();
        System.out.println("name = " + name);
        String fir= "HATICE";
        fir=fir.toLowerCase();
        System.out.println("fir = " + fir);

        System.out.println("===========================================");

        //Trim method= removing the white space(unused space) and returns new string object

        String spa= "              Cybertek School  ";
        spa= spa.trim();// "Cybertek School"
        System.out.println("spa = " + spa);

        System.out.println("======================================");

        // Replace method=
        String sen3= " Python is a easy language";
        sen3= sen3.replace("Python","Java");
        System.out.println(sen3);






















    }
}
