package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        optimalSol(arr,arr.length,3);


    }

    public static void optimalSol(int[] arr,int n,int k){
        int prefixSum=0,count=0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i <n ; i++) {
            prefixSum+=arr[i];
            int remove =prefixSum-k;
            count += map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }

        System.out.println(count);
    }

}
