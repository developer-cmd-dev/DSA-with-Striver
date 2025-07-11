package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MedianIOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1= {1,3,4,7,10,12};
        int[] arr2 = {2,5,6,15};
        System.out.println(bruteForce(arr1,arr2,arr1.length,arr2.length));
        System.out.println(binarySearch(arr1,arr2));

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


    public static double binarySearch(int[] a, int[] b) {
        int n1=a.length,n2=b.length; // 1  // 2
        int n=n1+n2; //3
        if(n1>n2) return binarySearch(b,a);

        int low = 0,high=n1; // 1
        int left = (n1+n2)/2; // 1

        while(low<=high){
            int mid1 = low + (high - low) / 2;
            int mid2 = (n1 + n2 + 1) / 2 - mid1;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE; //Min value
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE; // 1
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE; // 2
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE; // 3
            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
