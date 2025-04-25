package Sorting;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        int[] arr ={1,2,3,1};

        for (int num:arr){
            if (hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            }else{
                hashMap.put(num,1);
            }
        }

        System.out.println(hashMap);

    }
}
