package PracticeQuestions;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
    int[] arr={2,6,5,8,1};
        System.out.println(Arrays.toString(bruteForce(arr,arr.length,14)));

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



}
