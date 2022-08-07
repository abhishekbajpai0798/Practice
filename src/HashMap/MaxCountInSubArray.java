package HashMap;

import java.util.*;

public class MaxCountInSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,5,4,2,2,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
        }
        int ans= Collections.max(map.entrySet(),(e1,e2)->e1.getValue()-e2.getValue()).getKey();
        System.out.println(ans);
    }
}
