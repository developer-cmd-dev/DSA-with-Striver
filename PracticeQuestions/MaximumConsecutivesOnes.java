package PracticeQuestions;

public class MaximumConsecutivesOnes {
    public static void main(String[] args) {
    int[] arr={1,1,0,1,1,1,0,1,1};
    maxCons(arr,arr.length);


    }


    public static void maxCons(int[] arr,int n){
        int max=0;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==1){
                count++;
                if(count>max)max=count;
            }else{
                count=0;
            }

        }

        System.out.println(max);
    }
}
