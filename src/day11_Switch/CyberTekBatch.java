package day11_Switch;

public class CyberTekBatch {
    public static void main(String[] args) {

        String batchType="Us morning";
        boolean isValid= batchType=="Us morning" ||batchType=="Us evening"||batchType=="Eu batch";
        String result= "";


                if(isValid){
                    if (batchType== "Us morning"){
                        result="10am-5pm EST. M,T,Th,F";

                    }else if(batchType=="Us evening"){
                        result= "7pm-10pm EST. M,T,W,Th,S,S";
                    }else {
                        result= "10am-5pmEST. M, T, W,Th, F";
                    }

                }else{
                    result=" Invalid";

                }
        System.out.println("result = " + result);










    }
}
