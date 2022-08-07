package String;
import java.util.*;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "AAAAAABBBBCCCC";
        String ans="";
        HashMap<Character, Integer> map= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int of=map.get(c);
                int nf=of+1;
                map.put(c, nf);
            }
            else{
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            int range= (int) entry.getValue();
            if(range<9){
                ans+=entry.getKey()+""+ range;
            }
            else{
                int g=range/9;
                int h=range%9;
                while (g!=0){
                    ans+=entry.getKey()+""+ "9";
                    g--;
                }
                ans+=entry.getKey()+""+ h;
            }
        }
        System.out.println(ans);
    }
}
