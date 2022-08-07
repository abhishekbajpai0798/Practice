package HashMap;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s="loveleetcode";
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for (int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                System.out.println("index-> "+i+" & "+"Char-> "+s.charAt(i));
               return;
            }
        }
    }
}
