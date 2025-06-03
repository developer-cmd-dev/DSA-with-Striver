package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr ={
                {1,3},
                {2,6},
                {8,9},
                {9,11},
                {8,10},
                {2,4},
                {15,18},
                {16,17}
        };

        bruteForce(arr,arr.length);


    }
    public static void bruteForce(int[][] arr,int n){
        int columnIndex=1;
        Arrays.sort(arr,Comparator.comparingInt(row->row[columnIndex]));
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && ans.getLast().get(1)>=end) continue;

            for (int j = i+1; j <n ; j++) {
                if(end>=arr[j][0]){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }

            ans.add(Arrays.asList(start,end));


        }

        System.out.println(ans);

    }



}
