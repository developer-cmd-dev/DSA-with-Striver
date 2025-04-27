package Arrays;

import java.util.Arrays;

public class twoSumOptimalApproach {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println(twoSum(arr,arr.length,9));

    }

    public static String twoSum(int[] arr,int n,int target){
        Arrays.sort(arr);
        int left=0;
        int right =n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "YES";
            }else if (sum<target){
                left++;
            }else{
                right--;
            }
        }

        return "NO";

    }
}
