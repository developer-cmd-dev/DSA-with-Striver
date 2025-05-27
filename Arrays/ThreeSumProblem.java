package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumProblem {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;
        bruteForce(arr,arr.length,target);

    }

    public static  void bruteForce(int[] arr , int n ,int target){
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        set.add(List.of(arr[i],arr[j],arr[k]));
                    }

                }

            }
            
        }

        System.out.println(set);



    }


}
