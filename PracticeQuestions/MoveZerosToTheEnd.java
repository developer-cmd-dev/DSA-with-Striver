package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] arr={1,0,2,3,2,0,0,4,5,1};
        zerosTotheEndBrute(arr,arr.length);


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
}
