package PracticeQuestions;

import java.util.Arrays;

public class SortAnArrayOfZeroOneTow {
    public static void main(String[] args) {
    int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
    optimalApproach(arr,arr.length);


    }

    public static void optimalApproach(int[] arr,int n){

        int left=0,mid=0,high=n-1;

        while(mid<=high){
        if(arr[mid]==0){
            swap(arr,left,mid);
            left++;
            mid++;
        } else if (arr[mid]==1) {
            mid++;

        }else{
            swap(arr,mid,high);
            high--;
        }


        }

        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
