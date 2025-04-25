package Arrays;

import java.util.Arrays;

public class RotateArrayByOnePlace {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        int temp = arr[0];
         arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));



    }


}
