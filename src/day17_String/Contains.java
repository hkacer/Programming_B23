package day17_String;

public class Contains {
    public static void main(String[] args) {

        // contain(str)= checks if the given str is contained in the string. Returns boolean
        // ex= "My favorite programming language are C#, Java, JavaScript";
        // sentence.contains("Python")== I will be getting false

        String sentence= "My favorite programming language are: C#, Java, JavaScript";
        boolean hasPython= sentence.contains("Python");// has is usually used for this method, when you name it
        // is= equals has= contains
        boolean hasJava= sentence.contains("java");// it will give you false because in the sentence we have uppercase J
        //boolean hasJava2= sentence.toLowerCase().contains("java");


        System.out.println("hasPython = " + hasPython);// false
        System.out.println("hasJava = " + hasJava);// true
        //System.out.println("hasJava2 = " + hasJava2);// true

        // startsWith(str)= string sentence= "cybertek school is the best"; it will check if sentence starts with cybertek
        // it will return to you true and false. returns boolean
        //endsWith(str)= checks if the string is ended with given str.return boolean

        System.out.println("===============================");

        String sen= "Cybertek school is the best";
        boolean startsWithCybertek= sen.startsWith("Cybertek");// true
        boolean startsWithSchool= sen.startsWith("School");// false

        System.out.println("startsWithCybertek = " + startsWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);

        System.out.println("=============================");

        boolean endsWithBest= sen.endsWith("best");
        System.out.println("endsWithBest = " + endsWithBest);


















    }

}
