package day19_Loops;

public class WarmUp {
    public static void main(String[] args) {

        String word="aabbc";
        String res= " ";// "abc"

        String without= word.substring(0);
        if (word.length()==5){

        if(!res.contains(" "+ word.charAt(0))){ //'a' it does not contain this character.After first if result will look like'a'
            res+=word.charAt(0);
        }
        if(!res.contains(" "+ word.charAt(1))){ //'a'
            res+=word.charAt(1);
        }
        if (!res.contains(" "+ word.charAt(2))){// 'b'
            res+=word.charAt(2);
        }
        if (!res.contains(" "+ word.charAt(3))){//'ab'
            res+=word.charAt(3);
        }
        if (!res.contains(" "+ word.charAt(4))){// 'abc'
            res+=word.charAt(4);

        }
        }else if(word.length()>5){
            res="Too Long";
        }else {
            res="Too Short";
        }

    }
}
