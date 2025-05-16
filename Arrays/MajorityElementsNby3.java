package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsNby3 {
    public static void main(String[] args) {

        int[] arr={1,1,1,3,3,2,2,2};
        bruteForce(arr,arr.length);
        betterAppr(arr,arr.length);
        optimalSolution(arr,arr.length);



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


    public static void betterAppr(int[] arr,int n){

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }

        for (Map.Entry<Integer,Integer> it:map.entrySet()){

            if(it.getValue()>n/3){
                result.add(it.getKey());
            }

        }

        System.out.println(result);

    }


    public static void optimalSolution(int[] arr,int n){
        int count1=0,count2=0,elem1=Integer.MIN_VALUE,elem2=Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {


            if(count1==0 && elem2!=arr[i]){
                count1=1;
                elem1=arr[i];
            } else if(count2==0 && elem1!=arr[i]){
                count2=1;
                elem2=arr[i];
            }else if(elem1==arr[i]) count1++;
            else if(elem2==arr[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for (int i = 0; i <n ; i++) {
            if (elem1==arr[i])count1++;
            if (elem2==arr[i])count2++;
        }

        List<Integer> result=new ArrayList<>();
        if(count1>(n/3)) result.add(elem1);
        if(count2>(n/3)) result.add(elem2);
        System.out.println(result);



    }


}
