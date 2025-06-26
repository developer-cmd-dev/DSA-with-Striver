package BinarySearch;

public class CapacityToShipPackage {
    public static void main(String[] args) {
    int[] weights = {1,2,3,4,5,6,7,8,9,10};
    int days = 5;

        System.out.println(binarySearch(weights,days));
    
    
    


    }
    public static  int binarySearch(int[] weights,int days){

        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int elem:weights){
            max = Math.max(elem,max);
            sum+=elem;
        }

        int low = max,high=sum;
        while(low<=high){
            int mid = (low+high)/2;
            int requiredDays=calcDays(weights,mid);
            if(requiredDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;

    }

    public static int calcDays(int[] weights,int capacity){
        int load=0,day=1;
        for (int elem:weights) {
            if(load+elem>capacity){
                day++;
                load=elem;
            }else{
                load+=elem;
            }

        }

        return day;


    }
}
