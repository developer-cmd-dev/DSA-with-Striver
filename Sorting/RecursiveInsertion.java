package Sorting;

public class RecursiveInsertion {
    public static void main(String[] args) {
        int[] arr={3,4,9,8,2,0};
        int[] result = recursiveIns(arr,0,arr.length);
        for(int num:result){
            System.out.print(num+" ");
        }

    }

    public static int[] recursiveIns(int arr[],int i,int n){
        if (i == n) return arr;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveIns(arr, i + 1, n);
        return arr;
    }
}
