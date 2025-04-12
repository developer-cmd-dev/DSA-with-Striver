package Recursion;

public class SumOfN {
    public static void main(String[] args) {

        int sum=printsum(5,0);
        System.out.println("Parametrized Recursion: "+sum);
        System.out.println("Functional Recursion: "+printSumFun(5));



    }
    
    
//Parametrized recursion.
    public static int printsum(int i,int sum){
    if(i<1){
        return sum;

    }else {
       return printsum(i-1,sum+i);
    }

    }

//Functional recursion.
    public static int printSumFun(int n){
        if(n==0) return 0;
        return n+printSumFun(n-1);
    }
}
