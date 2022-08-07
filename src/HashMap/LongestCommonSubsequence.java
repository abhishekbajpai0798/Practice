package HashMap;
import java.util.*;
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map.put(s1.charAt(i), false);
        }
        for(int i=0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),true);
            }
        }
        int maxLen=0;
        for(char key: map.keySet()){
            if(map.get(key)==true){
                maxLen++;
            }
        }
            System.out.print(maxLen);
        return;

    }
}
