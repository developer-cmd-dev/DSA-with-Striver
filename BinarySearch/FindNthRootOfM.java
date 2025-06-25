package BinarySearch;

public class FindNthRootOfM {
    public static void main(String[] args) {
        binarySearch(69,4);


    }


    public static void binarySearch(int target,int n){
        long low=1,high=target;
        long ans = -1;

        while(low<=high){
            long mid = (low+high)/2;
            long value = findRootValue(n,mid);
            if(value==target) ans = mid;
            if(value>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println(ans);

    }
    public static long findRootValue(int n,long mid) {
        long ans =1;

        while (n>0){
            if(n%2==1){
                ans*=mid;
                n=n-1;
            }else{
                ans=mid*mid;
                n=n/2;
            }
        }
        return ans;
    }
}
