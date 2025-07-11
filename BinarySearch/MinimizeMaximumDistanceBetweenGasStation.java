package BinarySearch;

import java.util.*;

public class MinimizeMaximumDistanceBetweenGasStation {
    public static void main(String[] args) {


        int[] arr={1,13,17,23};
        int k=5;
        bruteForce(arr,k);
        System.out.println(optimalSolution(arr,k));



    }


    public static int bruteForce(int[] arr,int k){

       int[] howMany = new int[arr.length-1];

        for (int i = 1; i <=k ; i++) {

            int maxSection=-1;
            int maxIndex=-1;

            for (int j = 0; j <arr.length-1 ; j++) {
                int diff = (arr[j+1]-arr[j]);
                int sectionLength=diff/(howMany[j]+1);
                if (sectionLength>maxSection){
                    maxSection=sectionLength;
                    maxIndex=j;
                }
            }
            howMany[maxIndex]++;
        }

        int maxAns=-1;
        for (int i = 0; i <arr.length-1 ; i++) {
            int diff = (arr[i+1]-arr[i]);
            int sectionLength = (diff/(howMany[i]+1));
            maxAns = Math.max(sectionLength,maxAns);
        }

        System.out.println(maxAns);
        return 0;

    }


    public static int optimalSolution(int[] arr,int k){
        int[] howMany =new int[arr.length-1];
        Queue<List<Integer>> pq = new PriorityQueue<>((a,b)->b.getFirst()-a.getFirst());

        for (int i = 0; i <arr.length-1 ; i++) {
            int diff = (arr[i+1]-arr[i]);
            pq.add(List.of(diff,i));

        }

        for (int i = 1; i <=k ; i++) {
            List<Integer> top=pq.peek();
            pq.remove();
            int secInd = top.getLast();
            howMany[secInd]++;
            int iniDiff = (arr[secInd+1]-arr[secInd]);
            int newSec = iniDiff/(howMany[secInd]+1);
            pq.add(List.of(newSec,secInd));

        }

        return pq.peek().getFirst();
    }
}
