package Recursion;

import java.util.ArrayList;

import static Recursion.PermutationString.permutationArray;

public class ContainsPermutation {
    public static void main(String[] args) {
        String s1 = "prosperity";
        String s2 = "properties";
        ArrayList<String> ans = permutationArray("",s1);
        for(int i=0; i<ans.size(); i++){
            String str= ans.get(i);
            if(s2.contains(str)){
                System.out.println("true");
            }
        }
        System.out.println("false");
    }

    public  static ArrayList<String> permutationArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationArray(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
