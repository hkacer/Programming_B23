package day13_Scanner2;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your current Speed:");

        int speedLimit= 35;
        int current= input.nextInt();
        int overSpeedLimit= current-speedLimit;

        if (speedLimit>=0) {

            System.out.println(" You are driving " +overSpeedLimit+ " miles over Speed Limit. Slow Down!");
        }else {
            System.out.println(" Invalid Speed");
        }


    }
}
