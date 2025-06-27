package BinarySearch;

public class FindKthMissingNumber {
    public static void main(String[] args) {


        int[] arr = {2,3,4,7,11};
        System.out.println(bruteForce(arr,3));
        System.out.println(binarySearch(arr,3));



    }

    public static int bruteForce(int[] arr,int k){
        for (int j : arr) {
            if (j < k) {
                k = k + 1;
            } else {
                break;
            }
        }

        return k;
    }

    public static int binarySearch(int[] arr,int k){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k)low=mid+1;
            else high=mid-1;
        }

        return high+1+k;

    }
}
