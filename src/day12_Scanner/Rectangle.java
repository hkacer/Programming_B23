package day12_Scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter width of rectangle: ");
        int width= input.nextInt();

        System.out.println("Enter length of rectangle: ");
        int length= input.nextInt();

        int areaOfRectangle= width*length;
        int perimeter= (width+length)*2;

        System.out.println("area = " + areaOfRectangle);
        System.out.println("perimeter = " + perimeter);
        System.out.println("You completed required areas. Thank you!");









    }
}
