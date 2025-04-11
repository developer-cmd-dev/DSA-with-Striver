package BasicMath;

public class GCD {
    public static void main(String[] args) {

        int n1=9,n2=13;

        int gcd =0;

        for (int i = 1; i <=n1 ; i++) {
            if(n1%i==0&&n2%i==0){
                gcd =i;
            }

        }

        System.out.println(gcd);


    }
}
