package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram_hashmap {
    public static void main(String[] args) {
        String s1[]={"a","hack","rank","ackh","kran","a","bs"};
        String s2[]={"a","nark","bs","hack","stair"};
        HashMap<String, Integer> map=new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< s1.length; i++){
            char[] c1=s1[i].toCharArray();
            String sortedc1=sort(c1);
            if (map.containsKey(sortedc1)){
                int of=map.get(sortedc1);
                int nf=of+1;
                map.put(sortedc1,nf);
            }else{
                map.put(sortedc1,1);
            }
            System.out.println(sortedc1);

        }System.out.println("---------------");
        for (int i=0; i< s2.length; i++){
            char[] c2=s2[i].toCharArray();

            String sortedc2=sort(c2);
            System.out.println(sortedc2);
            if (map.containsKey(sortedc2)){
                list.add(map.get(sortedc2));
            }
        }
        System.out.println(list);
    }
    public static String sort(char ch[]){
        Arrays.sort(ch);
        String str = String.valueOf(ch);
        return str;
    }
}
