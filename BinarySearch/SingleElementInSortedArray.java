package BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(bruteForce(arr,arr.length));



    }

    public static int bruteForce(int[] arr,int n){
        for (int i = 0; i <n ; i++) {
            if(i==0){
                if(arr[i]!=arr[i+1]) return arr[0];
            } else if (i==n-1) {
                if(arr[i]!=arr[i-1]) return arr[i];
            }else{
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) return arr[i];
            }

        }
        return -1;
    }

}
