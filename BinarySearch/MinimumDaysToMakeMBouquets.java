package BinarySearch;

public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {

//        int[] arr = {7,8,9,10,11,12,13};
        int[] arr = {1,2,3,10};
        System.out.println(bruteForce(arr,3,1));
        System.out.println(binarySearch(arr,3,1));




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



    public static int binarySearch(int[] bloomDay,int m,int k){
        if(bloomDay.length < (m*k)) return -1;
        int high = findMax(bloomDay);
        int low = findMin(bloomDay);


        while(low<=high){
            int mid = (low+high)/2;
            if(search(bloomDay,m,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }


        return low;


    }

    public static boolean search(int[] arr,int m,int k,int days){
        int count=0;
        int noOfBou=0;
        for (int j : arr) {
            if (j <= days) {
                count++;
            } else {
                noOfBou += (count / k);
            }

        }
        noOfBou += (count / k);
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
