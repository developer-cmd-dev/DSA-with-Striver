package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsNby3 {
    public static void main(String[] args) {

        int[] arr={1,1,1,3,3,2,2,2};
        bruteForce(arr,arr.length);



    }
    public static void bruteForce(int[] arr,int n){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = i; j <n ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    if(count>n/3 && !result.contains(arr[i])){
                        result.add(arr[i]);
                        break;
                    }
                }

            }

        }

        System.out.println(result);
    }


}
