package HashMap;

import java.util.*;
//bucket Sort Approach
public class Top_kFrequentElement_BucketSort {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        int k=2;
        ArrayList<Integer>[] bucket = new ArrayList[arr.length+1]; // Creating Array of list;
        HashMap<Integer, Integer> map= new HashMap<>();
    for(int val:arr){
        map.put(val, map.getOrDefault(val,0)+1);
    }
    for (int key: map.keySet()){
        int freq=map.get(key);
        if(bucket[freq]==null){
            bucket[freq]=new ArrayList<Integer>();
        } bucket[freq].add(key);
    }
    int ans[]=new int[k];
    int count=0;
    for(int i= bucket.length-1; i>=0 ;i--){
        if(bucket[i]!=null){
            for (int j=0; j<bucket[i].size(); j++){
                ans[count++]=bucket[i].get(j);
            }
            if(count==k){
                break;
            }
        }
    }
    for(int val:ans){
        System.out.println(val);
    }

    }
}
