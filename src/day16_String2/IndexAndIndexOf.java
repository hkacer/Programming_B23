package day16_String2;

public class IndexAndIndexOf {
    public static void main(String[] args) {
        // indexOf("character")= give characters. it will give first character to index number

        String sen= "Java is a cool language";
        //index=     01234567891012345
        int indexOfFirstA=sen.indexOf("a");
        int indexOfSecondA= sen.indexOf("a ");
        int indexOfThirdA= sen.indexOf("a c");
        int indexOfForthA= sen.indexOf("an");
        int indexOfFifthA= sen.indexOf("ag");
        int indexOfL= sen.indexOf("l ");
        int lastIndex= sen.lastIndexOf("a");
        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfForthA);
        System.out.println(indexOfFifthA);
        System.out.println(indexOfL);
        System.out.println(lastIndex);

        System.out.println("===================================");













    }
}
