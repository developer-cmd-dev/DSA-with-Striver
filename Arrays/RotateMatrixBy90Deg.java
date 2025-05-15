package Arrays;

import java.util.Arrays;

public class RotateMatrixBy90Deg {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        optimalApp(matrix,matrix.length);



    }

    public static void optimalApp(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
//
//

        System.out.println(Arrays.deepToString(matrix));
    }
    public static void swap(int[][]matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
}




