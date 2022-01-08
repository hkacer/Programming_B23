package day11_Switch;

public class DaysInWeek {
    public static void main(String[] args) {

        String name="chrome";
        switch (name){

            case "chrome":
                System.out.println("chrome is selected");
                break; // case closed

            case "firefox":
                System.out.println("firefox is selected");
                break;

            case "edge":
                System.out.println("edge is selected");
                break;

            default:// only one default in the switch you cannot have more than one
                System.err.println("Invalid");
                break;
        }








    }
}
