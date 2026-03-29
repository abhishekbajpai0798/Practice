package HashMap;

import java.util.*;

public class MaxCountInSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,5,5,5,5,5,4,2,2,2,2,2,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
        }
        //way 1 using collection
        int ansKey= Collections.max(map.entrySet(),(e1,e2)->e1.getValue()-e2.getValue()).getKey();
        System.out.println(ansKey);

        int ansVal= Collections.max(map.entrySet(),(e1,e2)->e1.getKey()-e2.getKey()).getValue();
        System.out.println(ansVal);

        //way 2 using Map.Entry using enhanced for loop
        int maxKey = 0;
        int maxVal = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+"=>"+"Value: "+entry.getValue());
            maxVal = Math.max(entry.getValue(), maxVal);
            if(entry.getValue() == maxVal){
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey+" and "+ maxVal);
    }
}
