package day11_Switch;

public class OrLogicInSwitchStatement {
    public static void main(String[] args) {
        /*
        28 days:2
        20 days; 4,6,9,11
        31 days= 1,3,5,7,8,10,12
         */
        int number= 10;

        switch (number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;

            case 2:
                System.out.println("28 days ");
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;


            default:
                System.out.println("Invalid days");



        }



















    }
}
