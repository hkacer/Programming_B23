package day18_Recap;

public class StringMethodsExplanations {
    public static void main(String[] args) {
        /*
        charAt(index)= returns char, returns the charecter at the given index
        length(): returns int. returns the total number of characters
        lst index= length()-1
        toLowerCase/toUpperCase= returns new string
        String str="JAVA"
               str= str.toLowerCase();//"java"
               sout(str); //java
        trim();returns new string, removes all white spaces
        indexOf(characters)= returns int.
        lastIndexOf( character)= returns int.
        substring(beginning,ending index)= returns new string. creates substring from giving beginning index to ending index
        replace(old,new)= new string, replace old value with new value
                 str= "dog, cat";
               str=str.replace("cat,dog);// "dog,dog

        replaceFirst(old,new)= returns new string, replaces first value

        startsWith("ABC")

         */
        String schoolName= "Cybertek School";
        String name= schoolName.substring(0, schoolName.indexOf(" "));
        System.out.println("name = " + name);

        String sen= "I live in Viginia, I go to Cybertek School";
        String sen2= sen.substring(sen.indexOf("C"),sen.lastIndexOf(" ") );
        System.out.println("sen2 = " + sen2);

        System.out.println("============================");

        String str= "Dog Cat Dog Cat";
        System.out.println("str = " + str);
        str=str.replace("Cat","Dog");
        System.out.println("str = " + str);
        str=str.replaceFirst("Dog","Cat");
        System.out.println("str = " + str);

        System.out.println("=================");

        String sen3= "Java Java Java";
       // sen3= sen3.replaceFirst("Java","C#").replaceFirst("Java","Python");
        sen3= sen3.replace("Java Java ","C# Python ");
        System.out.println("sen3 = " + sen3);

        System.out.println("Yes".equals("yes"));// false

        System.out.println("Yes".equalsIgnoreCase("yes"));// true

        System.out.println("YES".equalsIgnoreCase("no"));// false



















    }
}
