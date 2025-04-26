package Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(findMissingNumber(arr,arr.length));


    }
    public static int findMissingNumber(int[] arr,int n){
        int i=0;
        while(i<n){
            int correct = arr[i];
            if(arr[i]<n&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < n ; j++) {
            if(arr[i]!=j) return j;
            
        }

        return n;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
