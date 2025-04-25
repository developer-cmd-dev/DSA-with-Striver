package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MergeSrotedArray {
    public static void main(String[] args) {

        int[] nums1 = {0};
        int[] nums2={2,5,6};

//        merge(nums1,3,nums2,3);

        List<Integer> arr = List.of(1,2);
        arr.size();
        System.out.println(arr.contains(2));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] newArr=new int[m+n];
        int k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                newArr[k]=nums1[i];
                i++;
            }else{
               newArr[k]=nums2[j];
                j++;
            }
            k++;

        }

        while(i<m){
            newArr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            newArr[k]=nums2[j];
            j++;
            k++;
        }

        for(int index=0;index<m+n;index++){
            if(nums1.length>nums2.length){
                nums1[index]=newArr[index];
            }else{
                nums2[index]=newArr[index];

            }
        }


        System.out.println(Arrays.toString(nums1));

    }

    public static void swap(int[] firstArr, int[] secondArr, int i, int j){
        System.out.println(i+" "+j);
        int temp = firstArr[i];
        firstArr[i]=secondArr[j];
        secondArr[j]=temp;
    }


}

