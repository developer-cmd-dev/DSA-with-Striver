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
        System.out.println(binarySearch(matrix,n,m));




    }

    public static int bruteForce(int[][] matrix,int n,int m){
        int max=Integer.MIN_VALUE;
        int index=-1;

        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <m ; j++) {
                count+=matrix[i][j];
            }
            if (count>max){
                max=count;
                index=i;
            }
        }

        return index;

    }


    public static int binarySearch(int[][] matrix,int n,int m){
        int cntMax=-1;
        int ind=-1;
        for (int i = 0; i <n ; i++) {
            int low =0;
            int high=m-1;
            int cnt =m - lowerBound(matrix[i],low,high,1);
            if (cnt>cntMax){
                cntMax=cnt;
                ind=i;
            }
        }

        return ind;

    }

    public static int lowerBound(int[] arr,int low ,int high,int target){
        int ans = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target) {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }


        return ans;

    }
}
