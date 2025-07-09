package PracticeQuestions;

public class BookAllocation {
    public static void main(String[] args) {

        int[] arr={25,46,28,49,24};
        System.out.println(bruteForce(arr,4));
        System.out.println(binarySearch(arr,4));



    }


    public static int bruteForce(int[] arr,int students){
        int n = arr.length;

        if (students>n) return -1;
        int low = Integer.MIN_VALUE,high=0;

        for (int elem:arr) {
            low = Math.max(elem,low);
            high+=elem;
        }


        for (int i = low; i <=high; i++) {
            int countStudents = count(arr,i);
            if (countStudents==students) return i;

        }

        return -1;




    }

    public static int binarySearch(int[] arr,int students){
        int n = arr.length;

        if (students>n) return -1;
        int low = Integer.MIN_VALUE,high=0;

        for (int elem:arr) {
            low = Math.max(elem,low);
            high+=elem;
        }

        while (low<=high){
            int mid = (low+high)/2;
            int countStudents = count(arr,mid);
            if (countStudents>students){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return low;

    }

    public static int count(int[] arr,int pages){
        int student=1,pagesStudent = 0;
        for (int elem:arr){
            if (pagesStudent+elem<=pages){
                pagesStudent+=elem;
            }else {
                student++;
                pagesStudent=elem;
            }
        }

        return student;
    }
}
