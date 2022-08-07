package HashMap;
import java.util.*;
public class ConvertRoman2Integer {
    public static void main(String[] args) {
        String str="III";
        String [] arr = str.split("");
        int ans=0;
        HashMap<String, Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                ans+=map.get(arr[i]);
            }
        }
        System.out.println(ans);
    }

}
