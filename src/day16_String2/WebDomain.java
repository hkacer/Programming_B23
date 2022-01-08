package day16_String2;

public class WebDomain {
    public static void main(String[] args) {

        String url= " www.amazon.com";

       // int name= url.indexOf(".")+1;
       // int nam2= url.lastIndexOf(".");
        String nam= url.substring(url.indexOf(".")+1, url.lastIndexOf("."));
        System.out.println(nam); // amazon will be output
        String dom= url.substring(url.lastIndexOf(".")+1);
        System.out.println(dom);

        //lastIndexOf("Character")= returns the index number of last occured character
        // indexOf("")= returns the index nu,ber of first occured character. returns int















    }
}
