package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersAnArray {
    public static void main(String[] args) {

        int[] arr = {10,22,12,3,0,6};
        bruteForce(arr,arr.length);

    }

    public static void bruteForce(int[] arr,int n){

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            boolean leader = true;
            for (int j = i; j <n ; j++) {
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }

            if(leader){
                result.add(arr[i]);
            }
            
        }

        System.out.println(result);
    }


}
