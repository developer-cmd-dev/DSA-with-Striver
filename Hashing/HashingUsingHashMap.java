package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingUsingHashMap {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int[] arr = {1,2,1,3,5,3,2,4};

      for (int num:arr){
          if (hashMap.containsKey(num)){
              hashMap.put(num, hashMap.get(num)+1);
          }else{
              hashMap.put(num,1);
          }
      }

        System.out.println(hashMap.get(4));


    }
}
