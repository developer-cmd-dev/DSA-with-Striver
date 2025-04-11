package BasicMath;

public class PrintAllDivisors {
    public static void main(String[] args) {

        int n = 36;

        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            System.out.println(i%n==0);
        }



    }
}
