package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] arr={1,0,2,3,2,0,0,4,5,1};
//        zerosTotheEndBrute(arr,arr.length);
        zerosTotheEndOptimal(arr,arr.length);
    }

    public static void zerosTotheEndBrute(int[] arr,int n){
        List<Integer> temp=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if(arr[i]!=0) temp.add(arr[i]);
        }


        for (int i = 0; i <temp.size() ; i++) {
            arr[i]=temp.get(i);
        }

        for (int i = temp.size(); i <n ; i++) {
            arr[i]=0;

        }

        System.out.println("Brute Force: "+ Arrays.toString(arr));
    }

    public static void zerosTotheEndOptimal(int[] arr,int n){

        int j=-1;
        for (int k = 0; k < n; k++) {
            if(arr[k]==0){
             j=k;
             break;
            }
        }

        for (int i = j+1; i <n ; i++) {
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }



        System.out.println("Optimal Approach: "+ Arrays.toString(arr));

    }

}
