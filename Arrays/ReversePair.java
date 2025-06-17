package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePair {
    public static void main(String[] args) {

//        int[] arr={40,25,19,12,9,6,2};
        int[] arr={1,3,2,3,1};
        int n=arr.length;
//        bruteForceApp(arr,n);
        OptimalSolution os = new OptimalSolution(arr);
        os.optimalSolutionMeth();


    }

    public static void bruteForceApp(int[] arr,int n){
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]>(arr[j]*2))count++;
            }
            
        }
        System.out.println(count);
    }
}


class OptimalSolution{
    public int[] arr;

    public OptimalSolution(int[] arr){
        this.arr = arr;
    }


    public void optimalSolutionMeth(){

        int low=0;
        int high = this.arr.length-1;
        System.out.println( mergeSort(this.arr,low,high));
//        System.out.println(this.count);
    }

    public int mergeSort(int[] arr,int low,int high){
        int count=0;
        if(low==high) return count;
        int mid = (low+high)/2;
        count+= mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }

    public int countPairs(int[] arr,int low,int mid,int high){
        int right = mid+1;
        int count=0;
        for (int i = low; i <mid ; i++) {
            while (right<=high && arr[i]>(2*arr[right])){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }

    public void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low,right=mid+1;
        while (left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }else{
                temp.add(arr[left]);
                left++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high ; i++) {
            arr[i]=temp.get(i-low);
        }
    }






}
