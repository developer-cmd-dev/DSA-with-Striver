package Arrays;

public class ReversePair {
    public static void main(String[] args) {

        int[] arr={40,25,19,12,9,6,2};
        int n=arr.length;
        bruteForceApp(arr,n);


    }

    public static void bruteForceApp(int[] arr,int n){
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                if(arr[i]>(arr[j]*2))count++;
            }
            
        }
        System.out.println(count);
    }
}
