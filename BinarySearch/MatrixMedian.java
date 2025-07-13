package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MatrixMedian {
    public static void main(String[] args) {

        int[][] matrix={
                {1,5,7,9,11},
                {2,3,4,5,10},
                {9,10,12,14,16}
        };

        System.out.println(bruteForce(matrix));
        System.out.println(binarySearch(matrix));

    }

    public static int bruteForce(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer>elements = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                elements.add(matrix[i][j]);
            }
        }

        elements.sort(null);
        return elements.get(((n*m)/2));
    }


    public static int binarySearch(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int req=((n*m)/2);
        int low = Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][m-1]);

        }
        while (low<=high){
            int mid=(low+high)/2;
            int smallerEquals = blackBox(matrix,mid);
            if(smallerEquals<=req)low=mid+1;
            else high=mid-1;
        }

        return low;
    }

    public static int blackBox(int[][] matrix,int x){
        int count=0;
        for (int[] ints : matrix) {
            count += upperBound(ints, x);
        }
        return count;

    }

    public static int upperBound(int[] arr,int target){
        int ans = arr.length;
        int low=0;
        int high=ans-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return ans;

    }
}
