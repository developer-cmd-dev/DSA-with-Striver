package Arrays;

import java.util.Arrays;

public class SetMatrixZeros
{
    public static void main(String[] args) {

        int[][] arr={
                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };

//        bruteForce(arr,arr.length,arr[0].length);
        bruteForce(arr,arr.length,arr[0].length);



    }

    public static void bruteForce(int[][] arr,int n,int m){

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==0){
                    markRow(arr,i,m);
                    markCol(arr,j,n);
                }

            }
            
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==-1)arr[i][j]=0;

            }

        }

        System.out.println(Arrays.deepToString(arr));
    }


    public static void markRow(int[][] arr,int i,int m){

        for (int j = 0; j <m ; j++) {
            if(arr[i][j]!=0)arr[i][j]=-1;
        }

    }

    public static void markCol(int[][] arr,int j,int n){


        for (int i = 0; i < n; i++) {
            if(arr[i][j]!=0)arr[i][j]=-1;
        }

        

    }


    public static void betterApro(int[][] arr,int n,int m){
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }

            }

        }


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }

        }

        System.out.println(Arrays.deepToString(arr));
    }


}
