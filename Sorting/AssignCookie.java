package Sorting;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {

        int[] g={10,9,8,7};
        int[] s={5,6,7,8};

        System.out.println(assignCookie(g,s));

    }


    public static int assignCookie(int[] g,int[] s){
        sort(g,g.length);
        sort(s,s.length);
        int left=0,right=0;
        int n=s.length;
        int m=g.length;
        while(left<n && right<m){
            if(s[left]>=g[right]){
                left++;
                right++;
            }else{
                left++;
            }
        }


        return right;



    }


    public static void sort(int[] arr,int n){

        for (int i = 0; i <=n-1 ; i++) {
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }



    }
}
