package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 8, 9, 10, 12, 17};
        int low = 0;
        int high = arr.length - 1;
        int target = 5;
        System.out.println(lowerBound(arr, low, high, target));

    }

    public static int lowerBound(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target) {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }


        return ans;

    }
}
