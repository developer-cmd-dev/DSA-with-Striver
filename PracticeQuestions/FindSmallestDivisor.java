package PracticeQuestions;

public class FindSmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold=6;
        System.out.println(bruteForce(arr,threshold));



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


    public static int calcDivisor(int[] arr,int divisor){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=Math.ceilDiv(arr[i],divisor);

        }
        return sum;
    }
}
