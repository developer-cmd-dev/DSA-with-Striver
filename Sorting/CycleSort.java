package Sorting;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {2,3,5,4,1,6};
        for (int num:cyclicSort(arr,0,arr.length)){
            System.out.print(num+" ");
        }


    }

    public static int[] cyclicSort(int[] arr,int i,int n){
        while(i<n){
            int correctIndex = arr[i]-1;
           if(arr[i]!=arr[correctIndex]){
               int temp = arr[i];
               arr[i]=arr[correctIndex];
               arr[correctIndex]=temp;
           }else {
               i++;
           }

        }
        return arr;
    }
}
