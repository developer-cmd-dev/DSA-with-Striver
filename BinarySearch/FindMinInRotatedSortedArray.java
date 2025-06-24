package BinarySearch;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        binarySearch(arr,arr.length);


    }


    public static void binarySearch(int[] arr,int n){
        int low = 0,high=n-1,ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                ans = Integer.min(arr[low],ans);
                low=mid+1;
            } else if (arr[mid]<=arr[high]) {
                ans=Integer.min(arr[mid],ans);
                high=mid-1;

            }

        }
        System.out.println(ans);

    }
}
