package Hashing;

public class StringHashing {
    public static void main(String[] args) {

        String str="abcacefgfg";
        char[] charArr = str.toCharArray();
        int[] hash = new int[256];

        for (int i = 0; i <charArr.length ; i++) {
            hash[charArr[i]-'a']++;
        }

        System.out.println(hash['b'-'a']);


    }
}
