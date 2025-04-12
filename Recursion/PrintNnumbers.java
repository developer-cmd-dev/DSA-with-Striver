package Recursion;

public class PrintNnumbers {
    private static int n=1;

    public static void main(String[] args) {

        printN();
    }

    private static int printN(){
        if (n==10){
            return 0;
        }else {
            System.out.println(n);
            n++;
            return printN();

        }
    }
}
