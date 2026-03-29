package HashMap;

import java.util.*;


public class TraverseInHashMap {
    public static void main(String[] args) {
        int arr[]={2,3,2,5,5,5,5,9,8,3,9};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            int val = arr[i];
            map.put(val, map.getOrDefault(val,0)+1);
        }
        int maxKey=0;
        int maxValue=0;
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
             maxValue = Math.max(maxValue, entry.getValue());
             if(maxValue == entry.getValue()){
                 maxKey=entry.getKey();
             }
        }
        System.out.println("Max Value: "+maxValue);
        System.out.println("Max Key: "+maxKey);

        int maxKey1 = Collections.max(map.entrySet(),(a,b)-> a.getValue()-b.getValue()).getKey();
        System.out.println(maxKey1);

        System.out.println("Key");
        for(int val: map.keySet()){
            System.out.println(val);
        }
        System.out.println("Value");
        for(int val: map.values()){
            System.out.println(val);
        }

    }
}
