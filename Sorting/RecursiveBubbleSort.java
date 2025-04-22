package Sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {

        int[] arr={3,4,2,6,8,9};
        int[] result = recurBS(arr,0,arr.length);
        for(int num:result){
            System.out.print(num+" ");
        }


    }


    public static int[] recurBS(int[] arr,int i,int n){
        if(i==n-1) return  arr;

        recurBS(arr,i+1,n);
        for (int j = 0; j <=i ; j++) {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }

        return arr;
    }
}
