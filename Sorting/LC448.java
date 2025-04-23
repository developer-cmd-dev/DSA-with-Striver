package Sorting;

import java.util.ArrayList;
import java.util.List;

public class LC448 {


    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer>result = new ArrayList<>();
        while(i<nums.length){
            int correct= nums[i]-1;
            if( nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }



        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1 ){
                result.add(index+1);
            }
        }
        if(result.isEmpty()){
            result.add(nums.length);
        }
        return result;
    }


    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
