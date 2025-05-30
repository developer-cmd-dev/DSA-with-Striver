package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithZeroSum {
    public static void main(String[] args) {

        int[] arr = {1,-1,3,2,-2,-8,1,7,10,25};
        int n = arr.length;
        optimalSolution(arr,n);


    }

    public static void optimalSolution(int[] arr,int n){

        int maxLen = Integer.MIN_VALUE;
        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <n ; i++) {
        sum+=arr[i];
        if(sum==0){
            maxLen=i+1;
        }else{
            if(map.get(sum)!=null){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }else {
                map.put(sum,i);
            }
        }

        }


        System.out.println(maxLen);



    }


}
