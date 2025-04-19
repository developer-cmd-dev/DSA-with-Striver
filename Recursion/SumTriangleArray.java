package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumTriangleArray {
    public static void main(String[] args) {

        List<Integer> arr = List.of(1,2,3,4,5);
        sumTriangleArray(arr,1);
    }

    public static void sumTriangleArray(List<Integer> arr, int n){
        if(n==5) return;
        sumTriangleArray(arr,n+1);
        System.out.println(arr);
    }
}
