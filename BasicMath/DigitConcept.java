package BasicMath;

import java.math.BigInteger;

public class DigitConcept {
    public static void main(String[] args) {

        String num  = String.valueOf(121);
        char[] charArr = num.toCharArray();
        String result = "";
        for(int i=charArr.length-1;i>=0;i--){
            System.out.println(charArr[i]);
            result+=charArr[i];
        }
        System.out.println(result.equals(num));
    }


}
