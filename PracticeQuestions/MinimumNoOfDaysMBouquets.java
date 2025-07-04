package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNoOfDaysMBouquets {
    public static void main(String[] args) {


        int[] arr = {7,7,7,7,13,11,13,7};
        int m=2,k=3;
        System.out.println(bruteForce(arr,m,k));

    }

    public static int bruteForce(int[] arr,int m,int k){

        Arrays.sort(arr);
        int low =arr[0];
        int high = arr[arr.length-1];
        for (int i = low; i <=high ; i++) {
            int calculatedDays = calcDays(arr,i,k);
            if (calculatedDays==m) return i;
            
        }
        return -1;



    }

    public static int calcDays(int[] arr,int days,int k){

        int countBouq=0;
        int pairs=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=days){
                pairs++;
                if(pairs==k)countBouq++;
            }else{
                pairs=0;
            }

        }
        System.out.println(countBouq);

        return countBouq;

    }
}
