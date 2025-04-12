package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        reverse(arr,0,arr.length);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void reverse(int[] arr,int i,int n){
        if(i>=n/2) return;

        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(arr,i+1,n);
    }

}