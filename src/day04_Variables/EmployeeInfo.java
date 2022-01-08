package day04_Variables;

import day03_Variables.SquareandPrint;

public class EmployeeInfo {

    public static void main(String[] args) {

        //name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

        String firstName= "Mevlut";
        String lastName= "Kaymaz";
        String fullName= firstName + " " + lastName;
        String gender= "Male";
        int age1 =31;
        String companyName= "SST";
        String jobTitle= "Science Teacher";
        boolean isFullTime= true;
        boolean isMarried= true;
        int salary= 110000;



        System.out.println("firstName = " + lastName);
        System.out.println("fullName = " + fullName);

        System.out.println("Employee' full name is: " +fullName);

        System.out.println("Aaron King is a " +gender);
        System.out.println(fullName+ " is "  +gender);

        System.out.println(fullName+ " is " +age1+ " years old");

        System.out.println(fullName+" is "+age1+" years old and working at "+ companyName);

        System.out.println(fullName+ " is "+ age1+ "years old and working at "+companyName+ " as a " + jobTitle+".");
        System.out.println(fullName+" is "+ age1+ " years old and working at " +companyName+ " as a "
                + jobTitle+"."+ " It is  "+isFullTime+ " that she is fulltime employee in our company. "+
                " it is " +isMarried+ " that she is married and  she is earning "+ salary+".");










    }







}
