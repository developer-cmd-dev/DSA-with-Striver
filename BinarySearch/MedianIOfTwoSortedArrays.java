package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MedianIOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1= {1,3,4,7,10,12};
        int[] arr2 = {2,5,6,15};
        System.out.println(bruteForce(arr1,arr2,arr1.length,arr2.length));

    }

    public static int bruteForce(int[] arr1,int[] arr2,int n,int m){

        int left = 0;
        int right=0;
        List<Integer>mergerArr = new ArrayList<>();

        while (left<n && right<m){
            if(arr1[left]<arr2[right]){
                mergerArr.add(arr1[left]);
                left++;
            }else{
                mergerArr.add(arr2[right]);
                right++;
            }

        }

        while (left<n)mergerArr.add(arr1[left++]);

        while (right<m) mergerArr.add(arr2[right++]);
        int sumOfNM = (n+m);

        if((sumOfNM/2)%2==1){
            return sumOfNM/2;
        }else{
            return (sumOfNM/2)+((sumOfNM/2)+1)/2;
        }





    }
}
