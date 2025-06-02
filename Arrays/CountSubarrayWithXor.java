package Arrays;

public class CountSubarrayWithXor {
    public static void main(String[] args) {

            int[] arr = {4,2,2,6,4};
            int target = 6;
            int n = arr.length;
        bruteForce(arr,n,target);


    }
    public static void bruteForce(int[] arr,int n,int target){
    int count=0;
        for (int i = 0; i <n ; i++) {
            int xor = 0;
            for (int j = i; j <n ; j++) {
                xor = xor^arr[j];
                if(xor==target) count++;

            }

        }

        System.out.println(count);

    }
}
