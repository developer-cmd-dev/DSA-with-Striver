package PracticeQuestions;

public class PaintersPartition {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        System.out.println(binarySearch(arr,2));


    }

    public static int binarySearch(int[] arr,int k){

        int n = arr.length;

        if (k>n) return -1;
        int low = Integer.MIN_VALUE,high=0;

        for (int elem:arr) {
            low = Math.max(elem,low);
            high+=elem;
        }

        while (low<=high){
            int mid = (low+high)/2;
            int countPainters = count(arr,mid);
            if (countPainters>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return low;


    }

    public static int count(int[] arr,int units){
        int painters =1,unitsPainted = 0;
        for (int elem:arr){
            if (unitsPainted+elem<=units){
                unitsPainted+=elem;
            }else {
                painters++;
                unitsPainted=elem;
            }
        }

        return painters;
    }
}
