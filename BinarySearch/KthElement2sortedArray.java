package BinarySearch;

public class KthElement2sortedArray {
    public static void main(String[] args) {

        int[] arr1= {2, 3, 6, 7, 9},arr2={1,4,8,10};
        int k=4;
        System.out.println(binarySearch(arr1,arr2,k));



    }

    public static double binarySearch(int[] a, int[] b,int k) {
        int n1=a.length,n2=b.length; // 1  // 2
        int n=n1+n2; //3
        if(n1>n2) return binarySearch(b,a,k);

        int low = Math.max(k-n2,0),high=Math.max(n,k); // 1
        int left = k; // 1

        while(low<=high){
            int mid1 = low + (high - low) / 2;
            int mid2 =(left-mid1);
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE; //Min value
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE; // 1
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE; // 2
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE; // 3
            if (l1 <= r2 && l2 <= r1) {
              return Math.max(l1,l2);
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
