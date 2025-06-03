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
        int columnIndex=1;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        bruteForce(arr,arr.length);
        optimalSolution(arr,arr.length);


    }
    public static void bruteForce(int[][] arr,int n){

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

    public static void optimalSolution(int[][] arr,int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if(ans.isEmpty() || arr[i][0]>ans.getLast().get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else{
                ans.getLast().set(1,Math.max(ans.getLast().get(1),arr[i][1]));
            }

        }
        int[][] answer = new int[ans.size()][ans.getFirst().size()];

        for (int i = 0; i <answer.length ; i++) {
            for (int j = 0; j <answer[i].length ; j++) {
                    answer[i][j]=ans.get(i).get(j);
            }
        }

        System.out.println(Arrays.deepToString(answer));

    }



}
