package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {

        int[] arr1={9,4,9,8,4};
        int[] arr2={4,9,5};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length) {

            while (j < nums2.length) {
                if (nums1[i] == nums2[j] && !result.contains(nums1[i])) {
                    result.add(nums1[i]);
                }
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println(result.size());
        int[] arr = new int[result.size()];
        return arr;
    }

}