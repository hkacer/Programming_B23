package day16_String2;

public class EmailDomain {
    public static void main(String[] args) {

        String email= "hkacer@apple.com";
       int beginningIndex= email.indexOf("@")+1;
       int endingIndex= email.lastIndexOf(".");

        String domain= email.substring(beginningIndex,endingIndex);
        System.out.println(domain);















    }
}
