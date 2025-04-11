package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {

        int n = 36;
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n) ; i++) {
          if(n%i==0){
              nums.add(i);
              if((n/i)!=i){
                  nums.add(n/i);
              }
          }
        }

       nums.sort(null);
        System.out.println(nums);

    }
}
