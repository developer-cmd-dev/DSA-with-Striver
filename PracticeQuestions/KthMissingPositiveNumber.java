package PracticeQuestions;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {

        int[] arr = {2,3,4,7,11};
        int k=5;
        System.out.println(bruteForce(arr,k));
        System.out.println(binarySearch(arr,k));

    }

    public static int bruteForce(int[] arr,int k){

        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]<=k)k++;
            else break;

        }

        return k;
    }

    public static int binarySearch(int[] arr,int k){

        int low =0;
        int high=arr.length-1;

        while (low<=high){

            int mid = (low+high)/2;
            int missing = arr[mid]-(mid+1);
            if (missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }

        return (high+k+1);





    }
}
