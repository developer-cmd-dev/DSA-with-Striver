package Arrays;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {

        int[] arr ={2,0,2,1,1,0};
        algo(arr,arr.length);
    }

    public static void algo(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;

            } else if (arr[mid]==2) {
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
