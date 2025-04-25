package Arrays;

public class SecondLargestNumberArray {
    public static void main(String[] args) {

        int[] arr = {1,2,4,7,7,5};
        System.out.println(secondLargestNum(arr,arr.length));

    }


    public static int secondLargestNum(int[] arr,int n){

        int largest =arr[0];
        int secondLargest = -1;


        for (int i = 1; i <n ; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest=arr[i];

            }

        }

        return secondLargest;


    }
}
