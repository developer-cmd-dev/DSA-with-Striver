package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumProblem {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;
//        bruteForce(arr,arr.length,target);
        betterSolution(arr,arr.length,target);

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

    public static void betterSolution(int[] arr , int n ,int target){

        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.clear();
            for (int j = i+1; j < n; j++) {
                int thirdAns = -(arr[i]+arr[j]);
                if(!set.contains(thirdAns)){
                    set.add(arr[j]);
                }else{
                    List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], thirdAns));
                    temp.sort((a,b)->a-b);
                    ans.add(temp);
                }


            }
            
        }

        System.out.println(ans);
        
        


    }


}
