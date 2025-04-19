package Hashing;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,1,3,5,5,6,8,8,8,8};
        int n =arr.length;

        int[] hash = new int[13];
        for (int i = 0; i <n ; i++) {
            hash[arr[i]]+=1;
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter Number :");
            int input = sc.nextInt();
            System.out.println(hash[input]);
        }

    }
}
