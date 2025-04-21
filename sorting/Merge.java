package sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};


        List<Integer> integers = mergeArr(nums1, 3, nums2, 3);
        System.out.println(integers);


    }

    public static List<Integer> mergeArr(int[] nums1, int m, int[] nums2, int n) {
        int left =0;
        int mid=m-1;
        int right =0;
        int high =n-1;
        List<Integer> temp=new ArrayList<>();

        while(left<=mid&&right<=high){
            if(nums1[left]<nums2[right]){
                temp.add(nums1[left]);
                left++;
            }else{
                temp.add(nums2[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums1[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums2[right]);
            right++;
        }
return temp;
    }
}
