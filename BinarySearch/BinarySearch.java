package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,9,12,17};
        int low = 0;
        int high = arr.length-1;
        int target=7;
        System.out.println( binarySearch(arr,low,high,target));
    }

    public static int binarySearch(int[] arr,int low ,int high,int target){

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                return mid;
            }
        }


return -1;

    }
}
