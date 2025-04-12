package Recursion;

public class PrintNames {
    private static String name ="Dev kumar";
    private static int count=0;

    public static void main(String[] args) {

        printNames();
    }
    public static int printNames(){
        if(count==5){
            return 0;
        }else{
            count++;
            System.out.println(name);
            return printNames();
        }
    }
}
