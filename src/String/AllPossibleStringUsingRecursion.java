package String;

import java.util.ArrayList;

public class AllPossibleStringUsingRecursion {
    public static void main(String[] args) {
        String str = "abc";
        int len = str.length();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> res = getSubstring(str,0,len,list);
        System.out.println(res.toString());
    }
    public static ArrayList<String> getSubstring(String str,int idx, int len, ArrayList<String> list){
        if(idx == len){
            return list;
        }
        for(int i=idx+1; i<=len; i++){
            String temp = str.substring(idx,i);
            list.add(temp);
        }
        getSubstring(str, idx+1, len, list);

    return  list;
    }
}
