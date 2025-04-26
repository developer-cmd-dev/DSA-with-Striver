package Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        moveZero(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero(int[] arr,int n){
        int j=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        int k=j+1;
        while(k<n){

            if(arr[k]!=0){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j++;
                k++;
                }else{
                    k++;
                }

        }


    }
}
