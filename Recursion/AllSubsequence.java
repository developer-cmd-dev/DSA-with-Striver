package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> subArr = new ArrayList<>();
        allSub(arr.length,arr,subArr,0);
    }

    private static void allSub(int n, int arr[], List<Integer> subArr,int i){

        if(i==n){
            System.out.println(subArr); //[3,1,2] , [3,1]
            return;
        }
        subArr.add(arr[i]); // 3,1,2
        allSub(n,arr,subArr,i+1); //
        subArr.removeLast(); // 3,1
        allSub(n,arr,subArr,i+1);
    }

}
