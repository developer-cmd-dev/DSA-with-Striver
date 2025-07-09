package PracticeQuestions;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(bruteForce(arr,days));


    }



    public static int bruteForce(int[] arr,int days){
        int n=arr.length;
        int low =arr[n-1];
        int high=0;
        for (int j : arr) {
            high += j;
        }


        for (int i = low; i <=high ; i++) {
            int daysRequired = countDays(arr,i);
            if (daysRequired<=days) return daysRequired ;

        }

         return -1;


    }

    public static int countDays(int[] arr,int capacity){
        int countDays=1;
        int load=0;
        for (int j : arr) {
            if (load + j > capacity) {
                countDays++;
                load = j;
                load = j;
            } else {
                load += j;
            }

        }

        return countDays;
    }
}
