package Sorting;

public class LC287 {
    public static void main(String[] args) {

        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        int i=0;

        for(int j=0;j<nums.length;j++){
            arr[j]=nums[j];
        }


        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){

            if(arr[index]!=index+1){
                return arr[index];
            }
        }

        return -1;


    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
