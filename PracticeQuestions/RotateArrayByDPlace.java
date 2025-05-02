package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByDPlace {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int d=3;
//        rotateArr(arr,arr.length,d);
        rotateArrayOptimal(arr,arr.length,d);


    }

    public static void rotateArr(int[] arr,int n,int d){  // Brute Force Solution.
        List<Integer>temp=new ArrayList<>();
        d=d&n;
        for (int i = 0; i <d ; i++) {
            temp.add(arr[i]);

        }

        for (int i = d; i <n ; i++) {
            arr[i-d]=arr[i];

        }

        for (int i = n-d; i <n ; i++) {
            arr[i]=temp.get(i-(n-d));

        }


        System.out.println("Brute Force: "+ Arrays.toString(arr));

    }



    public static void rotateArrayOptimal(int[] arr,int n,int d){
            reverseArr(arr,0,d-1);
            reverseArr(arr,d,n-1);
            reverseArr(arr,0,n-1);
        System.out.println("Optimal Approach: "+ Arrays.toString(arr));

    }


    public static void reverseArr(int[] arr,int left,int right){
      while(left<=right){
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
      }
    }





}
