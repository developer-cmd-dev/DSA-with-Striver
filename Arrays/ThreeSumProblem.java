package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;
//        bruteForce(arr,arr.length,target);
//        betterSolution(arr,arr.length,target);
        optimalSolution(arr,arr.length,target);



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


    public static void optimalSolution(int[] arr,int n,int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j = i+1;
            int k=n-1;

            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    ans.add(List.of(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while(j<k &&arr[j]==arr[j-1]) j++;
                    while(j<k &&arr[k]==arr[k+1])k--;


                }
            }

            
        }

        System.out.println(ans);


        
    }


}
