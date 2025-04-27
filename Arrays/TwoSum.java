package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    int[] arr={4,1,2,3,1};
        System.out.println(Arrays.toString(twoSum(arr,arr.length,5)));



    }

    public static int[] twoSum(int[] arr,int n,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i <n ; i++) {
            int a=arr[i];
            int more =target-a;
            if(map.containsKey(more)){
                 result[0]= map.get(more);
                 result[1]= i;
                 return result;

            }
            map.put(arr[i],i);

        }
    return result;
    }
}
