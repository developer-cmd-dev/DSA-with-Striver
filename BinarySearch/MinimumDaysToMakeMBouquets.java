package BinarySearch;

public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {

        int[] arr = {7,8,9,10,11,12,13};
        System.out.println(bruteForce(arr,2,4));




    }


    public static int bruteForce(int[] arr,int m,int k){
        int max = findMax(arr);
        int min = findMin(arr);

        for (int i = min; i <max ; i++) {
            if(search(arr, m, k, i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] arr,int m,int k,int days){
        int count=0;
        int noOfBou=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=days){
                count++;
            }else{
                noOfBou+=(count/k);
            }

        }

        return noOfBou >= m;
    }




    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
