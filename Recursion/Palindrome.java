package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        char[] charArr = str.toCharArray();
        System.out.println(checkPalindrome(charArr,0,charArr.length));

    }

    public static boolean checkPalindrome(char[] arr,int i,int n){
        if (i>=n) return true;
        if (arr[i]!=arr[n-i-1])return false;
        else return checkPalindrome(arr,i+1,n);
    }
}
