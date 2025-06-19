package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,9,12,17};
        int low = 0;
        int high = arr.length-1;
        int target=12;
        System.out.println( binarySearch(arr,low,high,target));
        System.out.println(recursiveWay(arr,low,high,target));
    }

    public static int binarySearch(int[] arr,int low ,int high,int target){

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                high=mid-1;
            } else if (arr[mid]<target) {
                low=mid+1;
            }
        }


return -1;

    }


    public static int recursiveWay(int[] arr,int low ,int high,int target){
        int mid = (low+high)/2;
        if(arr[mid]==target) return mid;
        if(low>=high) return -1;
        if(arr[mid]>target){
            high=mid-1;
        }else{
         low=mid+1;
        }
          return recursiveWay(arr,low,high,target);

    }
}
