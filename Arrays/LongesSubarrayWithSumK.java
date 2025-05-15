package Arrays;

public class LongesSubarrayWithSumK {
    public static void main(String[] args) {

        int[] arr={1,2,3,1,1,1,1,4,2,3};
        bruteForce(arr,arr.length,3);

    }

    public static void bruteForce(int[] arr,int n,int target){
        int longest=0;

        for (int i = 0; i <n ; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                if(sum==target) longest=Math.max(longest,j-i+1);
                
            }
            
        }

        System.out.println(longest);
    }
}
