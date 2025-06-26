package BinarySearch;

public class FindTheSmallestDivision {
    public static void main(String[] args) {

        int[] arr = {1,2,5,9};
        System.out.println(binarySearch(arr,6));


    }
    public static int binarySearch(int[] nums,int threshold){
        long max = Long.MIN_VALUE;
        long n = nums.length;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }

        long low = 1,high=max;
        while(low<=high){
            long mid = (low+high)/2;
            if(check(nums,mid,threshold)){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }


        return (int) low;
    }

    public static boolean check(int[] nums,long mid ,int threshold){
        long divideValue = 0;

        for (int num : nums) {
            divideValue += Math.ceilDiv(num, mid);
        }

        return divideValue <=threshold;
    }
}
