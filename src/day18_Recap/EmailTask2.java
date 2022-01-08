package day18_Recap;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        System.out.println("Enter your email:");
        String email= new Scanner(System.in).next();

        int indexOf_= email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        int gmail= email.indexOf(".");

        String first= email.substring(0, indexOf_);
        first= (" "+first.charAt(0)).toUpperCase()+first.substring(1).toLowerCase();
        // first charac is upper case + rest of the charac is the lower case
        String last= email.substring(indexOf_+1, indexOfAt);
        last=(" "+last.charAt(0)).toUpperCase()+last.substring(1).toLowerCase();

        String domain= email.substring(indexOfAt+1, gmail);

        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("domain = " + domain);






    }
}
