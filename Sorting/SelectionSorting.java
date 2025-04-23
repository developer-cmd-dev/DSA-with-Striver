package Sorting;

public class SelectionSorting {
    public static void main(String[] args) {

        int[] arr = {1,2,6,8,0,5,9,3};
        int n=arr.length;

        for (int i = 0; i <=n-2 ; i++) {
            int min=i;
            for (int j = i; j <=n-1 ; j++) {
                if(arr[j]<arr[min])min=j;
            }

            int temp =arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int num:arr){
            System.out.print(num+ " ");
        }


    }
}
