package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,1,3,1,1,3,1,1};
//        System.out.println(betterApproach(arr,arr.length));
        System.out.println(optimalApproach(arr,arr.length));

    }

    public static int betterApproach(int[] arr,int n){
        Map<Integer,Integer>map=new HashMap<>();
        int target = n/2;

        for (int i = 0; i <n ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
            
        }

        for (Map.Entry<Integer,Integer>value:map.entrySet()){
            if(value.getValue()>target){
                return value.getKey();
            }
        }
        return -1;
    }

    public static int optimalApproach(int[] arr,int n){
        int count=0;
        int elem=0;

        for (int i = 0; i <n ; i++) {
            if(count==0){
                elem=arr[i];
                count=1;
            } else if (count==arr[i]) {
                count++;

            }else{
                count--;
            }

        }
        int result=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==elem){
                result++;
                if(result>n/2) return arr[i];
            }
            
        }

        return -1;

        
    }
}
