package day09_IfStatements;

import sun.net.www.protocol.http.HttpURLConnection;

public class PrintName {
    public static void main(String[] args) {
        int n1= 5;

        boolean Monday= n1==1;
        boolean tuesday= n1==2 && !Monday;
        boolean Wed= !Monday && n1==3;
        boolean Thur= !tuesday && n1==4;
        boolean fri= !Wed && n1==5;
        boolean sat= !Thur && n1==6;
        boolean sun1= !fri && n1==7;
        // this is the long way and compier will check each one of them
        /*if ( Monday){
            System.out.println(" It is Monday");
        }
        if ( tuesday){
            System.out.println("It is Tuesday");
        }
        if (Wed){
            System.out.println("It is Wednesday");
        }
        if (Thur){
            System.out.println("It is Thursday");
        }
        if( fri){
            System.out.println("It is Friday");
        }
        if( sat){
            System.out.println("It is Friday");
        }
        if( sun){
            System.out.println("It is Friday");
        }
        */
        // multi- branch statement= more than 3 conditions
        //if block= condition is true
        // else if block= condition is true && previous conditions are false
        // else block= all previous conditions are false
        if ( Monday){
            System.out.println(" It is Monday");
        } else if ( tuesday){
            System.out.println("It is Tuesday");
        } else  if (Wed){
            System.out.println("It is Wednesday");
        } else if (Thur){
            System.out.println("It is Thursday");
        } else  if( fri){
            System.out.println("It is Friday");
        } else if( sat){
            System.out.println("It is Friday");
        } else if ( sun1){
            System.out.println("It is Friday");


        }



        }









    }

