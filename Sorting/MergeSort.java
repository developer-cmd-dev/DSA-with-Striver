package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr={2,3,5,7,8,5,6,3,1};

        for (int num:mergeSort(arr, 0, arr.length - 1)){
            System.out.print(num+" ");
        }

    }



    public static int[] mergeSort(int[] arr,int low,int high){

        if(low >=high) return arr;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
       return merge(arr,low,mid,high);

    }


    public static int[] merge(int[] arr,int low,int mid,int high){
         List<Integer> tempArr = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left<=mid&&right<=high){

            if(arr[left]<arr[right]){
                tempArr.add(arr[left]);
                left++;
            }else{
                tempArr.add((arr[right]));
                right++;
            }

        }

        while(left<=mid){
            tempArr.add(arr[left]);
            left++;
        }

        while(right<=high){
            tempArr.add(arr[high]);
            right++;
        }

        for (int i = low; i <=high ; i++) {
            arr[i]=tempArr.get(i-low);
        }


    return arr;



    }
}
