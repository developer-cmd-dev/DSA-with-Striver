package BinarySearch;

public class FindSqrtOfAnInteger {
    public static void main(String[] args) {

        binarySearch(49);

    }

    public static void binarySearch(int target){
        long low =1,high=target;
        while (low<=high){
            long mid = (low+high)/2;
            long value = mid*mid;
            if(value>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println(high);
    }
}
