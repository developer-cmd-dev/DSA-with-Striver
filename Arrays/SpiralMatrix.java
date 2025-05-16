package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        optimalSol(matrix, matrix.length);

    }

    public static void optimalSol(int[][] matrix,int n){

        int left=0,right=n-1,top=0,bottom =n-1;
        int count=1;

      while(left<=right && top<=bottom){
          for(int j=left;j<n;j++){
              matrix[left][j]=count++;
          }
          top++;
          for(int j=top;j<=bottom;j++){
              matrix[j][right]=count++;
          }

          right--;
          for(int j=right;j>=left;j--){
              matrix[bottom][j]=count++;
          }
          bottom--;
          for (int j = bottom; j >=top ; j--) {
              matrix[j][left]=count++;
          }
          left++;
      }


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }



    }
}
