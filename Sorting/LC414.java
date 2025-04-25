package Sorting;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LC414 {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        int index =0;

        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        System.out.println(set);

        if(set.size()<3){
            System.out.println(Collections.max(set));
        }
        else{
            for(int num:set){
                if(index==2){
                    System.out.println(num);
                }
                index++;
            }
        }
    }
}
