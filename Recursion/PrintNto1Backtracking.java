package Recursion;

public class PrintNto1Backtracking {
    public static void main(String[] args) {
    printNto1(1);
    }

    public static void printNto1(int i){
        if(i>5){
            return;
        }else{
            printNto1(i+1);
            System.out.println(i);
        }

    }
}
