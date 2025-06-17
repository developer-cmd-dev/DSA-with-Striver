package Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        bruteForce(arr,arr.length);
        optimalSolution(arr,arr.length);

    }

    public static void bruteForce(int[] arr,int n){
        long max = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            int product = 1;
            for (int j = i; j <n ; j++) {
                product*=arr[j];
                max = Long.max(product,max);
            }
            
        }

        System.out.println(max);
        
    }

    public static void optimalSolution(int[] arr,int n){
        int prefix = 1,suffix=1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix*=arr[i];
            suffix*=arr[n-i-1];

            max= Integer.max(max,Integer.max(prefix,suffix));
        }

        System.out.println(max);

    }
}
