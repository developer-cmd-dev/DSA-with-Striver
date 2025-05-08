package Arrays;

public class MaximumSumOfSubarray {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,1,-2,1,5,-3};
        System.out.println(otpimalApproach(arr,arr.length));

    }

//    Kadane's Algorithm.
    public static int otpimalApproach(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];

            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return max;
    }
}
