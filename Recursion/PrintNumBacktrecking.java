package Recursion;

public class PrintNumBacktrecking {
    public static void main(String[] args) {
    printNum(5);
    }

    private static void printNum(int i){
        if(i<1){
            return;
        }else{
            printNum(i-1);
            System.out.println(i);
        }
    }
}
