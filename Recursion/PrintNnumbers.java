package Recursion;

public class PrintNnumbers {

    public static void main(String[] args) {

        int n=10;
        int i=1;
        printN(i,n);
    }

    private static int printN(int i,int n){
        if (i>n){
            return 0;
        }else {
            System.out.println(i);
            return printN(i+1,n);

        }
    }
}
