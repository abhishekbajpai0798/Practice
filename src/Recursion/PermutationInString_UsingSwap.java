package Recursion;

public class PermutationInString_UsingSwap {
    static void permute(String s, int l, int r) {
        if(l == r) {
            System.out.print(s+" ");
        }
        for(int i = l; i<=r; i++) {
            s = swap(s,l,i);
            permute(s, l+1, r);
            s = swap(s,l,i);
        }
    }

    public static String swap(String s, int l, int i) {
        char[] str = s.toCharArray();
        char temp = str[i];
        str[i] = str[l];
        str[l] = temp;
        return new String(str);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length()-1);
    }
}

