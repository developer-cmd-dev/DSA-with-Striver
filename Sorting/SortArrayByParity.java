package Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
    int[] a={2,1,5};
    int[] b={3,1,2};
//    int[] fullArr={2,1,4,3,5,8};
//    int[] fullArr={3,1,2,4};
    int[] fullArr={0,1,2};
    sortArrayP(fullArr);
        System.out.println(Arrays.toString(fullArr));



    }

    public static void sortArrayP(int[] a){
        int i=0;
        int mid=a.length/2;
        int j=mid+1;

        while(i<=j){
            while(j<a.length){
                if(a[i]%2==1 && a[j]%2==0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    break;
                }
                j++;
            }
            j=mid;
            i++;
        }


    }
}
