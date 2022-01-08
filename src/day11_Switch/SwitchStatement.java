package day11_Switch;

public class SwitchStatement {
    public static void main(String[] args) {

        // Switch key word, case, default, break
        // syntax= Switch( data) {
        // case data1:
        //      statement1;
        //      break;
        //case data 2:
        //      statement1;
        //      break;
        //case data3:
        //   statement1;
        //     break;
        // default: when all cases are not matching with switch expression.
        //Switch cannot be boolean. It can be String, int,
        // in If you cna give any condition !=, ==, >=, <=, <....
        //
        //if we dont give the break statement in case blocks, the next block gets executed
        // until reaches the break statement or closing curly braces of switch.
        // switch statement does not accept; long, float,boolean, double,
        // anything has 2 different characters it will not be accepted by SWITCH....
        // boolean is reserved for IF statement only.

        //  || logic we cna use in switch by declaring the cases back to with break statement
    //}

        int n1= 8;
        switch (n1){
            case 1:
                System.out.println("Monday");
                break; // closes the block and exits the switch
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
                break;
        }












    }
}
