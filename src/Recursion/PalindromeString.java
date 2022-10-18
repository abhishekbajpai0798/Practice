package Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str="baab";
        Boolean checkPal= isPalindrome(str, 0, str.length()-1);
        System.out.println(checkPal);
    }

    private static Boolean isPalindrome(String str, int s, int e) {
        if(s>=e){
            return true;
        }
        if(str.charAt(s)==str.charAt(e)){
            return isPalindrome(str, s+1, e-1);
        }
        return false;
    }
}
