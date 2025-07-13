package BinarySearch;

import java.util.Arrays;

public class PeakElementIN2DMatrix {
    public static void main(String[] args) {

        int[][] mat = {
                {1,2,5,1,4,5},
                {2,9,3,2,3,2},
                {1,7,6,0,1,3},
                {3,6,2,3,7,2}
        };

        System.out.println(Arrays.toString(findPeakGrid(mat)));




    }

    public static int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int low=0,high=n-1;

        while(low<=high){
            int mid = (low+high)/2;
            int row = findMaxElemRow(mat,m,n,mid);
            int left = mid-1>=0 ? mat[row][mid-1] :-1;
            int right = mid+1<n?mat[row][mid+1]:-1;

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }else if(mat[row][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return new int[]{-1,-1};

    }

    public static int findMaxElemRow(int[][] mat,int m,int n,int col){
        int max=-1;
        int index=-1;
        for(int i=0;i<m;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }

        return index;
    }


}
