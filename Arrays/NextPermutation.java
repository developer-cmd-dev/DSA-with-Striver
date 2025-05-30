package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {

//        int[] arr = {2,1,5,4,3,0,0};
        int[] arr = {1,2,3};
        optimalSolution(arr, arr.length);

    }
    public static  void optimalSolution(int[] arr,int n){
        int index = -1;
        for (int i = n-2; i >=0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        reverse(arr, index + 1, n - 1);






    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
