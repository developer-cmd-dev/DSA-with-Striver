package sorting;

public class QuickSorting {

    public static void main(String[] args) {



    }

    public static int[] qs(int[] arr,int low,int high){

        if(low<high){
            int partionIndex = partitionFunc(arr,low,high);
            qs(arr,low,partionIndex-1);
            qs(arr,partionIndex+1,high);


        }
        return arr;
    }

    public static int partitionFunc(int[] arr,int low ,int high){
 return 0;
    }
}
