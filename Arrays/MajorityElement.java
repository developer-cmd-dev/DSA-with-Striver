package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
    int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElem(arr,arr.length));

    }

    public static int majorityElem(int[] arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
       for (int elem:arr){
            if(map.containsKey(elem)){
                map.put(elem,map.get(elem)+1);
            }else{
                map.put(elem,1);
            }
       }

        System.out.println(map);

       for (Map.Entry<Integer,Integer> value:map.entrySet()){
           if(value.getValue()>(n/2)) return value.getKey();
       }
    return -1;

    }
}
