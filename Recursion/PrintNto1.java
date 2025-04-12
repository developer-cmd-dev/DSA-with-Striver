package Recursion;

public class PrintNto1 {
    private static int n=10;

    public static void main(String[] args) {
    printnto1();
    }

    private static int printnto1(){
        if (n==0){
            return 0;
        }else {
            System.out.println(n);
            n--;

            return printnto1();
        }
    }
}
