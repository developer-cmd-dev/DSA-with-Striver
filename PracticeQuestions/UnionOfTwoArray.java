package PracticeQuestions;

import java.util.*;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
//        unionBruteForce(arr1,arr2,arr1.length,arr2.length);
        unionOptimalApp(arr1,arr2,arr1.length,arr2.length);

    }


    public static void unionBruteForce(int[] arr1,int[] arr2,int n,int m){

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            set.add(arr1[i]);

        }

        for (int i = 0; i <m ; i++) {
            set.add(arr2[i]);

        }
        System.out.println(set);





    }



    public static void unionOptimalApp(int[] arr1,int[] arr2,int n,int m){
        int i=0;
        int j=0;
        List<Integer>union=new ArrayList<>();

        while(i< n &&j< m){
            if(arr1[i]<=arr2[j]){
                if(union.isEmpty() || union.getLast()!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;

            }else{
                if(union.isEmpty() || union.getLast()!=arr2[j]){
                    union.add(arr2[j]);

                }
                j++;
            }

        }


        while (i<n){
            if(union.isEmpty() || union.getLast()!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while (j<m){
            if(union.isEmpty() || union.getLast()!=arr2[j]){
                union.add(arr2[j]);

            }
            j++;
        }

        System.out.println(union);





    }
}
