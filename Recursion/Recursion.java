package Recursion;

public class Recursion{
    private static int count=0;

    public static void main(String[] args) {

        print();

    }

    public static int print(){
        if(count==10) {
            return 0;
        }else{
            System.out.println(count);
            count++;
           return print();
        }

    }


}
