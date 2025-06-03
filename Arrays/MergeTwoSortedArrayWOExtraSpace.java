package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrayWOExtraSpace {
    public static void main(String[] args) {

        int[] arr1={1,3,5,7},arr2={0,2,6,8,9};
        bruteFroce(arr1,arr2,arr1.length,arr2.length);


    }

    public static void bruteFroce(int[] arr1,int[] arr2,int n,int m){

        int[] temp = new int[n+m];

        int i =0,j=0,index=0;
        while (i<n && j<m){

            if(arr1[i]>arr2[j]){
                temp[index]=arr2[j];
                j++;
            }else{
                temp[index]=arr1[i];
                i++;
            }
            index++;
        }

        while (i<n){
            temp[index] = arr1[i];
            i++;
            index++;
        }

        while (j<m){
            temp[index] = arr2[j];
            j++;
            index++;
        }

        for (int k = 0; k <temp.length ; k++) {
            if (k<arr1.length){
                arr1[k]=temp[k];
            }else{
                arr2[k-arr1.length]=temp[k];
            }

        }

        System.out.println(Arrays.toString(temp));


    }
}
