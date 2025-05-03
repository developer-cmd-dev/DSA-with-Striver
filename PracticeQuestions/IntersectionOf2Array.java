package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2Array {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        interSection(arr1,arr2,arr1.length,arr2.length);

    }

    public static void interSection(int[]arr1,int[]arr2,int n,int m){

        int i=0;
        int j=0;
        List<Integer>result=new ArrayList<>();
        while (i<n&&j<m){

            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            }else{
                result.add(arr1[i]);
                i++;
                j++;
            }

        }

        System.out.println(result);


    }
}
