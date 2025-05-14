package Arrays;

import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr={102,4,100,1,101,3,2,1,1};
        bruteForce(arr,arr.length);
        betterApproach(arr,arr.length);
    }


    public static void bruteForce(int[] arr,int n){

        int longest=1;
        for (int i = 0; i < n; i++) {
            int count=1;
            int x=arr[i];
            while (linerSearch(arr,x+1)){
                count++;
                x=x+1;
            }

            if(count>longest)longest=count;
        }

        System.out.println(longest);

    }

    public static boolean linerSearch(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target) return true;

            
        }
        return false;
    }


    public static void betterApproach(int[] arr,int n){
        Arrays.sort(arr); // Sorting is important;
        int longest=1,count=0,lastSmaller=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]-1==lastSmaller){
                count++;
                lastSmaller=arr[i];
            }else if (arr[i]!=lastSmaller){
                count=1;
                lastSmaller=arr[i];
            }
            if(count>longest)longest=count;
        }

        System.out.println(longest);
    }
}
