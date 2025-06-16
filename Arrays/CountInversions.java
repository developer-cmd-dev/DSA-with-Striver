package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {

    private static int count=0;

    public static void main(String[] args) {

        int[] arr={5,3,2,4,1};
        int n= arr.length;
        bruteApproach(arr,n);
        optimalSolution(arr,0,arr.length-1);
        System.out.println(getCount());


    }

    public static void bruteApproach(int[] arr,int n){
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j])count++;
            }
        }

        System.out.println(count);
    }

    public static void optimalSolution(int[] arr,int low,int high){
            if(low == high) return;
            int mid = (low+high)/2;
            optimalSolution(arr,low,mid);
            optimalSolution(arr,mid+1,high);
            merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low,right=mid+1;
        while (left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                setCount(getCount()+(mid-left+1));
                right++;
            }else{
                temp.add(arr[left]);
                left++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high ; i++) {
            arr[i]=temp.get(i-low);
        }


    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CountInversions.count = count;
    }
}
