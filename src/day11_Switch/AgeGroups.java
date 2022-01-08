package day11_Switch;

public class AgeGroups {
    public static void main(String[] args) {

        int age = -1;
        String res = "";

        if (age >= 0 && age<=150) {
            if (age >= 21 && age < 55) {
                res = " Adult";
            } else if (age < 21) {
                res = "Teenager";

            } else {
                res = "Senior";
            }


        } else
            res = "Invalid";
        System.out.println("res = " + res);



    }




    }