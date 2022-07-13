package HashMap;

import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int arr[]={1,1,1,6,6,6,6,2,2,3,3,3,3,4,4,4,4,4,2};
        int k=2;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int val:arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        System.out.println(list);
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        System.out.println(list);
        //Convert list into Array
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
            System.out.print(res[i]+" ");
        }
    }
}
