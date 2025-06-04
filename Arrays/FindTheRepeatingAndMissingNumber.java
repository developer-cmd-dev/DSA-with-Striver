package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheRepeatingAndMissingNumber {
    public static void main(String[] args) {

        int[] arr={4,3,6,2,1,1};
        betterSolution(arr,arr.length);



    }
    public static void betterSolution(int[] arr,int n){
        int[] hash = new int[n+1];
        for (int i = 0; i <n ; i++) {
            hash[arr[i]]++;
        }

        int repeating =-1,missing=-1;
        for (int i = 1; i <=n ; i++) {
            if(hash[i]==2){
                repeating=i;
            }
            if (hash[i]==0) missing=i;

            if(repeating!=-1&& missing!=-1) break;

        }

        System.out.println(repeating+" "+missing);

        
    }
}
