package day07_ShortHand_Relational;

public class ShortHandOperator {


    public static void main(String[] args) {

       // =; assignment
        // int a =5;
        // int b= 10;
        // sout(a);


       // += : addition assignment (can be applicable to string)

        // a=20;
        // a= a+10; ==

       // -= :
        // *=:
        // /=:
        // %= :
       String name1= "muhtar";
       String name2= " Mehmet";
        String name3= name2;

       name2= name1;// name2=muhtar
       name1= name3;// name= mehmer
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);


        System.out.println("==============================");

        int a= 200;
        System.out.println("a = " + a);// java goes with first come first serve
        int b= a;

        a= 100+300;
        System.out.println("a = " + a);

        System.out.println("====================");

        int balance= 300;
        balance+=200;

        //balance= balance+200;
        System.out.println("balance = " + balance);

        balance+=1000;
        System.out.println("balance = " + balance);


        String school= "Cybertek";
        school += " School";

        System.out.println("school = " + school);

        String name= " John";
        String lastName= "Daniel";
        name += " ";
        name+= " " +lastName;
        System.out.println("name = " + name);
        System.out.println("-------------------");
        // withdraw money
        balance-=300;
        System.out.println("balance = " + balance);

        balance-= 1000;
        System.out.println("balance = " + balance);
        System.out.println("----------------------------------");


        //*=
        double salary= 100000;
        salary*=2;
        System.out.println("salary = $ " + salary);
        salary *= 1.5;
        System.out.println("salary = " + salary);
        // 0.65 take home salary
        salary *=0.65;

        System.out.println("salary = " + salary);
        System.out.println("----------------------");

        // /=

        double slices= 10;


        slices /= 3;
        System.out.println("slices = " + slices);
        System.out.println("==================================");

        // %= 105 cents ===> 4 quarters and 5 cents
        int cents= 105;
        int quarters= cents/25;
        cents %= 25;


        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int z= 198;
        boolean evenNumber= z/2 >=0;
        System.out.println("evenNumber = " + evenNumber);

























    }
}
