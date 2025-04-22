package Sorting;

import java.util.ArrayList;
import java.util.List;

public class LC448 {


    public static void main(String[] args) {

        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer>result = new ArrayList<>();
        while(i<nums.length){
            int correct= nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }



        }

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index && nums[index] !=nums.length){
                result.add(index);
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
