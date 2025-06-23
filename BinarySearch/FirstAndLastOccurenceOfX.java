package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOfX {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,8,8,11,13};
        firstAndlastO(arr,8);



    }


    public static void firstAndlastO(int[] arr,int target){
        int low=0,high=arr.length-1;
        int lb = lowerBound(arr,low,high,target);
        int ub=upperBound(arr,low,high,target);
        System.out.println(ub);
        if(lb==arr.length||arr[lb]!=target) System.out.println(Arrays.toString(new int[]{-1,-1}));
        System.out.println(Arrays.toString(new int[]{lb,ub-1}));
    }

    public static int lowerBound(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }


    public static int upperBound(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
