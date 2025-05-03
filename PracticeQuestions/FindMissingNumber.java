package PracticeQuestions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        findBrute(arr,arr.length);

    }

    public static void findBrute(int[] arr,int n){
        int result=-1;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]!=i){
                result=i;
                break;
            }

        }

        System.out.println(result);
    }
}
