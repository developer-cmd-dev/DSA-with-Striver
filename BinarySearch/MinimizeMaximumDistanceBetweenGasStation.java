package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimizeMaximumDistanceBetweenGasStation {
    public static void main(String[] args) {


        int[] arr={1,13,17,23};
        int k=5;
        bruteForce(arr,k);



    }


    public static int bruteForce(int[] arr,int k){

       int[] howMany = new int[arr.length-1];

        for (int i = 1; i <=k ; i++) {

            int maxSection=-1;
            int maxIndex=-1;

            for (int j = 0; j <arr.length-1 ; j++) {
                int diff = (arr[j+1]-arr[j]);
                int sectionLength=diff/(howMany[j]+1);
                if (sectionLength>maxSection){
                    maxSection=sectionLength;
                    maxIndex=j;
                }
            }
            howMany[maxIndex]++;
        }

        int maxAns=-1;
        for (int i = 0; i <arr.length-1 ; i++) {
            int diff = (arr[i+1]-arr[i]);
            int sectionLength = (diff/(howMany[i]+1));
            maxAns = Math.max(sectionLength,maxAns);
        }

        System.out.println(maxAns);
        return 0;

    }
}
