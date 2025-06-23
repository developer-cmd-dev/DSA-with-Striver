package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {

        int[] nums = {7,8,9,1,2,3,4,5,6};
        System.out.println(binarySearch(nums,1));




    }

    public static int binarySearch(int[] nums,int target){
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target) return mid;

            if(nums[low]<=nums[mid]){

                if(nums[low]<=target && target <=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }


            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }



        }

        return -1;
    }
}
