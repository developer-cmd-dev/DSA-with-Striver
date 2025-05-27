package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProblem {
    public static void main(String[] args) {
    int[] arr = {1,2,1,3,1,2,4,2,3,3,4,5,5,4};
    optimalSolution(arr,arr.length,8);

    }

    public static void optimalSolution(int[] arr,int n, int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for (int j = i+1; j <n ; j++) {
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l = n-1;
                while(k<l){
                    long sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        ans.add(List.of(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1])k++;
                        while(k<l && arr[l]==arr[l+1])l--;
                    }
                }


            }

        }
        System.out.println(ans);


    }


}
