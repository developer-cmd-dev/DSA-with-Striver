public class FindRowWithMax1s {
    public static void main(String[] args) {

        int[][] matrix = {
                {0,0,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println(bruteForce(matrix,n,m));




    }

    public static int bruteForce(int[][] matrix,int n,int m){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]==1) count++;
            }
            max=Math.max(max,count);
        }

        return max;

    }
}
