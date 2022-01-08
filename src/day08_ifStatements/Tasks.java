package day08_ifStatements;

public class Tasks {
    public static void main(String[] args) {

        int ApplesCount= 20;
        int orangeCount= 30;
        int pearsCount= 30;

        boolean comp= ApplesCount< orangeCount || orangeCount >= pearsCount;

        System.out.println("comp = " + comp);

        String outsideWeather;
        int degree;
        outsideWeather= "Shinny";
        degree= 70;

        boolean comp2= (!(outsideWeather=="Rainy"||degree==70));

        System.out.println("comp2 = " + comp2);

        int b= 2;
        boolean res= ++b==2 || --b==2 && --b==2;
        System.out.println("res = " + res);
        boolean x= true, z= true;
        int y= 20;
        x=(y!=10)||(z=false);

        System.out.println("x = " + x);






    }











}
