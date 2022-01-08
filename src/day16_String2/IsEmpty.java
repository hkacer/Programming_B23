package day16_String2;

public class IsEmpty {
    public static void main(String[] args) {
        // isEmpty = it will return you boolean and it checks if the string empty


        String s2= "   ";
        s2=s2.trim();// if you give trim method it will give you true because you removed all space
        boolean r1= s2.isEmpty();
        System.out.println("r1 = " + r1);// output will say empty"". if you give space between "" it will give you false.

        // equals method= or equalsIgnoreCase()
        String str1= "cat";// it is in the string pool
        String srt2= new String("cat");// java heap
        String str3= new String("cat");

        System.out.println(str1==srt2);
        System.out.println(str1.equals(srt2));// use for only String
        System.out.println(str1==str3);// gives false
        System.out.println(str1.equals(str3));// gives true because you are only checking the text


        // equals(string)= it returns boolean true or flase. do not use == to compare string
        // use equal() method to be able to see if it is the same word
        System.out.println("============================");
        String w1= "Java";
        String w2= "java";
        System.out.println(w1.equals(w2));// if you use java with lower case it will give you false
        //becasue java is case sensitive
        System.out.println(w1.equalsIgnoreCase(w2));// if you use this method
        // it will ignore the case sensitvity and give you true. Java==java if you
        //use ignorecase method.













    }
}
