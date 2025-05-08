package PracticeQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
    int[] arr={2,6,5,8,1};
//        System.out.println(Arrays.toString(bruteForce(arr,arr.length,14)));
//        System.out.println(Arrays.toString(betterApproach(arr,arr.length,14)));
        System.out.println(optimalApproach(arr,arr.length,14));

    }

    public static int[] bruteForce(int[] arr,int n,int target){
        int[] result=new int[2];
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if((arr[i]+arr[j])==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                };
                
            }

        }
        return result;
    }



    public static int[] betterApproach(int[] arr,int n,int target){
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for (int i = 0; i <n ; i++) {
            if(map.containsKey(target-arr[i])){
                result[0]=i;
                result[1]=map.get(target-arr[i]);
            }else{
                map.put(arr[i],i);
            }
        }
        System.out.println(map);


        return result;


        
    }

    public static boolean optimalApproach(int[] arr,int n,int target){
        Arrays.sort(arr);
        int left=0,right=n-1;
        while (left<right){
            if((arr[left]+arr[right])<target){
                left++;
            } else if ((arr[left]+arr[right])>target) {
                right--;
            }else if((arr[left]+arr[right])==target){
                return true;
            }
        }

        return false;

    }



}
