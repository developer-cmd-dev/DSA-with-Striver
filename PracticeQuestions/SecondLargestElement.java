package PracticeQuestions;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr ={8,8,7,6,5};

        System.out.println(secondLargestElement(arr,arr.length));

    }
    public static int secondLargestElement(int[] arr,int n){

        int largest=-1;
        int secondLargest=-1;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>largest)largest=arr[i];
        }

        for (int i = 0; i <n ; i++) {
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }

        return secondLargest;

    }
}
