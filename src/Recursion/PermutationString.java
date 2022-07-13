package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
       permutation("","abcd");
        System.out.println("------------------------------------");
        ArrayList<String> ans = permutationArray("","abc");
        System.out.println(ans);
      /* for (int i=0; i< ans.size(); i++){
           String str= ans.get(i);
           System.out.println(str);
       }*/
    }
    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i=0; i<=p.length(); i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            permutation(f+ch+s, up.substring(1));
        }
    }
    public static ArrayList<String> permutationArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch=up.charAt(0);
        for (int i=0; i<=p.length(); i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            ans.addAll(permutationArray(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
