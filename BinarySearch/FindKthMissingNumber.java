package BinarySearch;

public class FindKthMissingNumber {
    public static void main(String[] args) {


        int[] arr = {2,3,4,7,11};
        System.out.println(bruteForce(arr,3));



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
}
