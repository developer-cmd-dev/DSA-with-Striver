package Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr={102,4,100,1,101,3,2,1,1};
        bruteForce(arr,arr.length);
    }


    public static void bruteForce(int[] arr,int n){

        int longest=1;
        for (int i = 0; i < n; i++) {
            int count=1;
            int x=arr[i];
            while (linerSearch(arr,x+1)){
                count++;
                x=x+1;
            }

            if(count>longest)longest=count;
        }

        System.out.println(longest);

    }

    public static boolean linerSearch(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target) return true;

            
        }
        return false;
    }
}
