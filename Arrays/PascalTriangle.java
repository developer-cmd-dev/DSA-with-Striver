package Arrays;

public class PascalTriangle {
    public static void main(String[] args) {

        System.out.println(funcNcR(4,2));



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
}
