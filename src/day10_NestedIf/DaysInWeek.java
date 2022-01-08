package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int day = 8; // 1~7

        String name = "";
        if (day >= 1 && day <= 7) {

        }
          /*


            if (day == 1) {
                name = "Mon";
            } else if (day == 2) {
                name = "Tue";
            } else if (day == 3) {
                name = "Wed";
            } else if (day == 4) {
                name = "Thur";
            } else if (day == 5) {
                name = "Fri";
            } else if (day == 6) {
                name = "Sat";
            } else {
                name = "Sun";
            }
        } else {
            name = " No Such A Day";
        }


        System.out.println("name = " + name);

           */
        name= (day >= 1 && day <= 7)?(day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wed":(day==4)?"Thur"
                :(day==5)?"Fri":(day==6)?"Sat":"Sun": "No Such a DAy";

        System.out.println("name = " + name);


    }

}