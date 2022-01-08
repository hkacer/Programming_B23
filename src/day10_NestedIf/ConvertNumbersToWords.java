package day10_NestedIf;

public class ConvertNumbersToWords {
    public static void main(String[] args) {
        // 0~9
        int n1= 6;
        String word=" ";

        if ( n1>=0 && n1<=9){
            if (n1==0){
                word= "A";
            }else if( n1==1){
                word= "B";
            } else if( n1==2){
                word= "B";
            }else if( n1==3){
                word= "C";
            }else if( n1==4){
                word= "D";
            }else if( n1==5){
                word= "E";
            }else if( n1==6){
                word= "F";
            }else if( n1==7){
                word= "G";
            }else if( n1==8){
                word= "H";
            }else{
                word= " I";
            }
        }else{
            word= "Number is Invalid";
        }
        System.out.println("word = " + word);

        // single if= 1 option
        // if else= 2 options
        // multi-branch= 3 or more options
        // nested if= pre-condition required


    }
}
