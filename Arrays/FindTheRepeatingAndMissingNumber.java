package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheRepeatingAndMissingNumber {
    public static void main(String[] args) {

        int[] arr={4,3,6,2,1,1};
        betterSolution(arr,arr.length);
        optimalUsingMath(arr,arr.length);



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

    public static void optimalUsingMath(int[] arr,int n){
        long SN = ((long) n *(n+1))/2; // Sum of given n;
        long S2N = ((long) n*(n+1)*(2L *n+1))/6;
        long s=0,s2=0;
        for (int i = 0; i <n ; i++) {
            s+=arr[i];
            s2+=((long) arr[i]*arr[i]);
        }

        long value1 = SN-s;
        long value2 = S2N-s2;
        value2 = value2/value1;
        long x = (value1+value2)/2;
        long y = x-value1;
        System.out.println(x+" "+y);
    }
}
