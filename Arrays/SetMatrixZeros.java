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


        int[][] matrix={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};

//        bruteForce(arr,arr.length,arr[0].length);
//        betterApro(arr,arr.length,arr[0].length);
//        optimalApproach(matrix,matrix.length,matrix[0].length);
        optimalApproach(arr,arr.length,arr[0].length);



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


    public static void optimalApproach(int[][] arr,int n,int m){

        int col0=1;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }


            }

        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }

        if(arr[0][0]==0){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }

}
