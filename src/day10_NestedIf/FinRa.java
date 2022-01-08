package day10_NestedIf;

public class FinRa {
    public static void main(String[] args) {

        int n1= 15;
        String name=" ";


        if (n1%5==0 && n1%3==0){
            name= "FinRA";

        } else if( n1%5==0){
            name= "RA";

        }else if( n1%3==0){
            name= "FIN";

        }else {
            name= ""+n1;

        }
        System.out.println("name = " + name);




    }
}
