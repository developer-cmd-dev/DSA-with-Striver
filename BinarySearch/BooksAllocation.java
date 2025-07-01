package BinarySearch;

public class BooksAllocation {
    public static void main(String[] args) {

        int[] arr={25,46,28,49,24};
        int students=4;
        System.out.println(bruteForce(arr,students));

    }

    public static int bruteForce(int[] arr,int students){

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n=arr.length;
        for (int j : arr) {
            max = Math.max(j, max);
            sum += j;
        }

        int low =max,high=sum;

        for (int i = low; i <=high ; i++) {
            int countStudents=count(arr,i);
            if (countStudents==students)return i;

        }


         return -1;

    }

    public static int count(int[] arr,int pages){
        int student=1,allocatePage=0;
        for (int j : arr) {
            if ((j + allocatePage) <= pages) {
                allocatePage += j;
            } else {
                student++;
                allocatePage = j;
            }

        }
        return student;
    }
}
