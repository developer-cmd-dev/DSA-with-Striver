package PracticeQuestions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums,nums.length));


    }

    public static int removeDuplicates(int[] arr,int n){

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        return i+1;


    }
}
