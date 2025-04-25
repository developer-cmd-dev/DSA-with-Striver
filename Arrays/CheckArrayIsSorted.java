package Arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println(arraySorted(arr,arr.length));

    }
    public static boolean arraySorted (int[] arr,int n){
        for (int i = 1; i <n ; i++) {
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }


        }
        return true;
    }
}
