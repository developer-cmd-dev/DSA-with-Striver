package BinarySearch;

public class FindSqrtOfAnInteger {
    public static void main(String[] args) {

        binarySearch(49);

    }

    public static void binarySearch(int target){
        int low =1,high=target;
        while (low<=high){
            int mid = (low+high)/2;
            if((mid*mid)>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println(high);
    }
}
