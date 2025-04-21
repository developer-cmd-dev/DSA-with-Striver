package sorting;

public class InsertionSorting {
    public static void main(String[] args) {

        int[] arr={13,46,24,52,20,9};
        for(int num:insertionSort(arr,arr.length)){
            System.out.print(num+" ");
        }



    }

    public static int[] insertionSort(int[] arr,int n){
        for (int i = 0; i <=n-1 ; i++) {
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        return arr;
    }
}
