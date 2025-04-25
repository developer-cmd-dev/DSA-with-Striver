package Arrays;

import java.util.Arrays;

public class RotateArrayByOnePlace {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};

        System.out.println(Arrays.toString(arrayRotation(arr,arr.length,3)));



    }

    public static int[] arrayRotation(int[] arr,int n,int rotation){

        int j=0;
       while(j<rotation){
                int firstElem = arr[0];
                for (int i = 1; i <n ; i++) {
                    arr[i-1]=arr[i];
                    arr[i]=firstElem;

                }
            j++;
        }

        return  arr;
    }


}
