package Recursion;

public class PrintNto1 {

    public static void main(String[] args) {
        int n=1;
        int i=10;
    printnto1(i,n);
    }

    private static int printnto1(int i,int n){
        if (i<n){
            return 0;
        }else {
            System.out.println(i);
           return   printnto1(i-1,n);
        }
    }
}
