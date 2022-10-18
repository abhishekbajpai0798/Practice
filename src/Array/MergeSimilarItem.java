package Array;

import java.util.*;

public class MergeSimilarItem {
    public static void main(String[] args) {
        int items1[][] = {{15,5},{2,6},{5,3},{14,8},{12,4},{19,6},{25,4},{13,4},{9,1}};
        int items2[][] = {{15,9},{2,4},{5,2},{14,4},{12,3},{19,10},{25,7},{13,6},{9,9}};
        List<List<Integer>> list=new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<items1.length; i++){
            int val = items1[i][0];
            int weight=items1[i][1];
            map.put(val,weight);
        }
        System.out.println(map);
        for(int i=0; i<items2.length; i++){
            int val = items2[i][0];
            int weight=items2[i][1];
            if(map.containsKey(val)){
                int wt=map.get(val);
                map.put(val,wt+weight);
            }
        }
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            ArrayList<Integer> sublist=new ArrayList<>(2);
            int key=pair.getKey();
            int val=pair.getValue();
            sublist.add(key);
            sublist.add((val));
            list.add(sublist);
        }
        System.out.println(list);
    }
}
//hint :for ordered map use TreeMap
// for unOrdered map use HashMap;