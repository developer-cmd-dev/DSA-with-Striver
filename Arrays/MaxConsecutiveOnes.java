package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
 int[] nums={1,1,0,1,1,1};
        System.out.println(maxConsecutive(nums,nums.length));
    }

    public static int maxConsecutive(int[] nums,int n){
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }else{

                count=0;

            }
        }



        return max;
    }
}
