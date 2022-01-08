package day07_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Hatice Kacer";

        int age= 18;

        String citizen= "USA";
        int creditScore= 750;


        boolean eligible= age>=18 && citizen== "USA" && creditScore>=700;

        //                34>=18 && UK== USA
        //                True && false == False

        System.out.println("is eligible to vote for Biden = " + eligible);














    }














}
