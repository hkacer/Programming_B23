package day10_NestedIf;

public class NamesOfMonth {

    public static void main(String[] args) {
        int num = 12;
        String month = " ";


        if (num >= 1 && num <= 12) {
            if (num == 1) {
                month = "Jan";
            } else if (num == 2) {
                month = "Feb";
            } else if (num == 3) {
                month = "Mar";
            } else if (num == 4) {
                month = "Apr";
            } else if (num == 5) {
                month = "May";
            } else if (num == 6) {
                month = "Jun";
            } else if (num == 7) {
                month = "Jul";
            } else if (num == 8) {
                month = "Aug";
            } else if (num == 9) {
                month = "Sep";
            } else if (num == 10) {
                month = "Oct";
            } else if (num == 11) {
                month = "Nov";
            } else  {
                month = "Dec";
            }

        } else {
            month = "Invalid";
        }
        System.out.println("month = " + month);


        month= (num==1)?"Jan":(num==2)?"Feb":(num==3)?"Mar":
                (num==4)?"Apr":(num==5)?"May":(num==6)?"Jun":(num==7)?"Jul":
                        (num==8)?"Aug":(num==9)?"Sep":(num==10)?"Oct":(num==11)?"Nov":"Dec";


    }
}
