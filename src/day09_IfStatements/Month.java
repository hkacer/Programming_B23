package day09_IfStatements;

public class Month {
    public static void main(String[] args) {

        int month= 12;
        boolean days28= month==2;
        boolean days30= month ==4 || month==6 || month==9 || month==11;
        boolean days31= !days28 && !days30;
        //boolean days31= month==1 || month==3 || month==7 || month==8 || month==10 || month==11;
         if (days28){
             System.out.println("28 Days");
         }
        if (days30) {
            System.out.println(" 30 days");
        }
        if ( days31){
            System.out.println( "31 days");
        }








    }
}
