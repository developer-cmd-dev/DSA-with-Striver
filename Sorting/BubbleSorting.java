package Sorting;

public class BubbleSorting {
    public static void main(String[] args) {

//        int[] arr = {13,46,24,52,20,9}; Non-sorted Array.
        int[] arr = {9,10,11,12,13}; //Sorted Array.


        int n=arr.length;
        for (int num:bubbleSort(arr,n)){
            System.out.print(num+" ");
        }





    }

    public static int[] bubbleSort(int[] arr,int n){

        int didSwap=0; // Added some optimization for if Array is already sorted. It will check in the first operation there any swap happened if not, it will not perform the next step.
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <=i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            System.out.println("Operation happened");
            if (didSwap==0) break;
            
        }

    return arr;


    }
}
