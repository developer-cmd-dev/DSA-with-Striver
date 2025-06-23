package BinarySearch;

public class FloorAndCiel {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 8, 9, 10, 12, 17};
        int low = 0;
        int high = arr.length - 1;
        int target = 5;
        System.out.println(floor(arr, low, high, target));
        System.out.println(ciel(arr, low, high, target));

    }

    public static int floor(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=target) {
                ans = arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }

        }


        return ans;

    }

    public static int ciel(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target) {
                ans = arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }

        }


        return ans;

    }
}
