package day16_String2;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        // replace(old value, new value)= all old values will be replaced by the given new value

        String email= "hkacer@yahoo.org";
         email=email.replace("yahoo","gmail"); // it will replace yahoo with gmail
        System.out.println("email = " + email);// it will be hkacer@gmail.com
        //it does not replace one, it will replace all existed values. all yahoos are going to be replaced.

        String sen= " C# is cool, C# is fun";
        //sen=sen.replace("C#","Java"); it replaces all c# with Java
        //sen= sen.replaceFirst("C#","Java");// Java is cool, c# is fun output will be this
        sen= sen.replaceFirst("C# is f","Java is f"); //you can make it unique.
        System.out.println("sen = " + sen);
        // there is a way called replacefirst and it will replace first one

        String s= " Cat Dog Cat Dog Cat";
        s= s.replace("Cat","Dog");// all cats will be replaced with dog
        // if uou use replace first, it will be first cat replace with dog.
        System.out.println("s = " + s);











    }
}
