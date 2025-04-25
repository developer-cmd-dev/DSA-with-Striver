package Arrays;

import java.util.Arrays;

public class RotateByKplaces {
    public static void main(String[] args) {

        int[] arr={-1,-100,3,99};
        rotateByKplaces(arr,arr.length,3);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotateByKplaces(int[] nums,int n,int k){
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
