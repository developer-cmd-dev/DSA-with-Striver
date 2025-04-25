package Arrays;

public class LargestElementINArray {
    public static void main(String[] args) {
    int[] arr = {1,4,5,8,7,9};
        System.out.println(findLargestNum(arr));
    }

    public static int findLargestNum(int[] arr){
        int largest =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest) largest=arr[i];

        }
        return largest;
    }
}
