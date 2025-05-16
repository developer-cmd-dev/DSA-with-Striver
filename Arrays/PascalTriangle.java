package Arrays;

public class PascalTriangle {
    public static void main(String[] args) {

//        System.out.println(funcNcR(4,2));
        printRow(6);


    }

    // Find Number using given row and column;
    public static int funcNcR(int row, int col){
        int result=1;

        for (int i = 0; i <col ; i++) {
            result=result*(row-i);
            result=result/(i+1);
        }

        return result;


    }

    //Print any nth row of pascal triangle
    public static void printRow(int n){
        int result=1;
        System.out.print(result+" ");
        for (int i = 1; i <n ; i++) {
                result=result*(n-i);
                result=result/i;
            System.out.print(result+" ");
        }
    }
}
