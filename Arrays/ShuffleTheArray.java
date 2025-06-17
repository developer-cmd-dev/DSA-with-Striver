package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] arr = {2,5,1,3,4,7};
        int n=(arr.length/2);
        solution(arr,n);




    }

    public static void solution(int[] nums,int n){
        int[] ans = new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+1]=nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
