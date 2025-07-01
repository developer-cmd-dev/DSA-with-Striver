package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

        int[] arr = {0,3,4,7,10,9};
        int cows = 4;

        System.out.println(bruteForce(arr,cows));




    }

    public static int bruteForce(int[] arr,int cows){
        Arrays.sort(arr);
        int n= arr.length;
        int min = arr[0],max=arr[n-1];

        for (int i = 1; i <(max-min) ; i++) {

            if(canWePlace(arr,i,cows)){
                continue;
            }else{
                return i-1;
            }
        }

        return -1;
        
    }

    public static boolean canWePlace(int[] arr,int dist,int cows){

        int countCows=1,lastCow=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]-lastCow>=dist){
                countCows++;
                lastCow=arr[i];
            }

        }

        if (countCows>=cows) return true;
        else return false;




    }




}
