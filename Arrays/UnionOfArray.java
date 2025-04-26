package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArray {
    public static void main(String[] args) {
    int[] a = {1, 1, 2, 3, 4, 5};
    int[] b = {2,3,4,4,5,6};
        System.out.println(unionOfArray(a,b));

    }

    public static List<Integer> unionOfArray(int[] arr1, int[] arr2){
        int i = 0, j = 0,n=arr1.length,m=arr2.length; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;

    }
}
