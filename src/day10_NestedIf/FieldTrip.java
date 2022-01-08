package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade= 7;
        String loc= "";
        int groups= 0;
        String teacher= "";

        if ( grade>=1 && grade<=6){
            if ( grade==1){
                loc = " Apple Orchad" + loc;
                groups = 3;
                teacher = "Ms. Smith" + teacher;

            }else if( grade==2){
                loc = "Zoo";
                groups = 7;
                teacher = "Mr.Lee";
            }else if( grade==3){
                loc = "Aquarium";
                groups = 5;
                teacher = "Ms.Wilson";
            }else if( grade==4){
                loc = "Movie Theater";
                groups = 2;
                teacher = "Mr.Reyes";
            }else if( grade==5){
                loc = "Museum";
                groups = 5;
                teacher = "Ms.Lela";
            } else {
                loc = "Six Flags";
                groups = 8;
                teacher = " Mr.Watt";
            }
        }else{
            loc = "Unknown";
            groups = 0;
            teacher = "Invalid Response";
        }
        System.out.println("grade = " + grade);
        System.out.println("teacher = " + teacher);
        System.out.println("groups = " + groups);
        System.out.println("loc = " + loc);








    }
}
