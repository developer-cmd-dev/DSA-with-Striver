package BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class KokoEeatingBanana {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(bruteForce(arr,8,arr.length));
    }


    public static int bruteForce(int[] piles,int h,int n){
        Arrays.sort(piles);
        int low =1,high= piles[n-1];

        while(low<=high){
            int mid =(low+high)/2;
            int totalHour = totalHourCalc(piles,mid);

            if(totalHour<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;

    }

    public static int totalHourCalc(int[] arr,int i){
        int ans = 0;
        for (int j = 0; j <arr.length ; j++) {
            ans+= Math.ceilDiv(arr[j],i);
        }

        return ans;
    }
}
