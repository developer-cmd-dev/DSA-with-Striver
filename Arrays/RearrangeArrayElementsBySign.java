package Arrays;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
    int[] arr={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(optimalApp(arr,arr.length)));

    }


    public static int[] optimalApp(int[] nums,int n) {
        int pos = 0;
        int neg = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                result[pos] = nums[i];
                pos = pos + 2;
            } else {
                result[neg] = nums[i];
                neg = neg + 2;
            }
        }
        return result;

    }


}
