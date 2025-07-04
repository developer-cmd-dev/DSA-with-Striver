package PracticeQuestions;

public class FindSmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold=6;
        System.out.println(bruteForce(arr,threshold));
        System.out.println(binarySearch(arr,threshold));



    }

    public static int bruteForce(int[] arr,int threshold){
        int n=arr.length;
        int low = 1;
        int high=arr[n-1];

        for (int i = low; i <=high ; i++) {


            if (calcDivisor(arr,i)<=threshold) return i;

        }
        return -1;
    }

    public static int binarySearch(int[] arr,int threshold){
        int low=1;
        int n=arr.length;
        int high=arr[n-1];

        while (low<=high){
            int mid=(low+high)/2;
            if (calcDivisor(arr,mid)<=threshold){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }

        return low;

    }


    public static int calcDivisor(int[] arr,int divisor){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=Math.ceilDiv(arr[i],divisor);

        }
        return sum;
    }
}
