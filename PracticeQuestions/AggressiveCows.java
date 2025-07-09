package PracticeQuestions;

public class AggressiveCows {
    public static void main(String[] args) {

        int[] arr = {0,3,4,7,9,10};
        int cows = 4;
        System.out.println(bruteForce(arr,cows));
        System.out.println(binarySearch(arr,cows));




    }

    public static int bruteForce(int[] arr,int cows){
        int min = arr[0],max = arr[arr.length-1];
        for (int i = 0; i <=(max-min) ; i++) {

            if (coutCows(arr,i,cows)) continue;
            else return i-1;

        }

        return -1;

    }


    public static int binarySearch(int[] arr,int cows){

        int low = 1,high = arr[arr.length-1]-arr[0];
        while (low<=high){
            int mid = (low+high)/2;
            if (coutCows(arr,mid,cows)){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }

        return high;


    }

    public static boolean coutCows(int[] arr,int distance,int cows){

        int countCows = 1;
        int lastCow = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]+-lastCow)>=distance){
                countCows++;
                lastCow=arr[i];
            }

        }

        return(countCows>=cows);

    }
}
