package HashMap;
import java.util.*;
public class MaxCharacterCount {
    public static void main(String[] args) {
        String str="test";
        HashMap<Character, Integer> map= new HashMap<>();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        char ans= Collections.max(map.entrySet(),(a,b)->a.getValue()-b.getValue()).getKey();
        //char ans= Collections.max(map.entrySet(),(e1,e2)->e1.getValue()-e2.getValue()).getKey();
        System.out.println(ans);

    }
}
