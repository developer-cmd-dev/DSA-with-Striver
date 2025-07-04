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


        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for (int j : arr) {
            max = Math.max(j, max);
            min = Math.min(j, min);

        }

        for (int i = min; i <=max ; i++) {
            int calculatedDays = calcDays(arr,i,k);

            if (calculatedDays==m) return i-1;
            
        }
        return -1;



    }

    public static int calcDays(int[] arr,int days,int k){

        int countBouq=0;
        int pairs=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=days){
                pairs++;
            }else{
                countBouq+=(pairs/k);
                pairs=0;
            }

        }
        countBouq+=(pairs/k);

        return countBouq;

    }
}
