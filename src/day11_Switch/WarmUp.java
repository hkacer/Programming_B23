package day11_Switch;

public class WarmUp {
    public static void main(String[] args) {
        double salary= 60_000;
        int score= 550;
        String res= "";


        String loan= (salary>=60000 && score>=650)?"Loan Accepted":"Loan Denied";
        System.out.println("loan = " + loan);

        String soc= " Soccer";
        int fee= (soc=="Soccer" || soc=="Tennis Fee")?100:50;
        System.out.println("fee = " + fee);

        int n1= 1;
        int n2=2;
        int n3= 4;

        String big= (n1>n2 && n1>n3)?n1+" is bigger":(n2>n1 && n2>n3)?n2+" is bigger ":
                n3+"  is bigger";
        System.out.println("big = " + big);

        System.out.println("++++++++++++++===================");

        int num1= 12;
        String name= "";

        if( num1>=1 && num1<=12){
            name=( num1==1)?"Jan":(num1==2)?"Feb":(num1==3)?"Mar":(num1==4)?"Apr":
                    (num1==5)?"May":(num1==6)?"Jun":(num1==7)?"Jul":(num1==8)?"Aug:":
                            (num1==9)?"Sep":(num1==10)?"Oct":(num1==11)?"Nov":"Dec";
                    // 11: and 11 ? they are equal
        }else {
            name= "Invalid";
        }
        System.out.println("name = " + name);







    }
}
