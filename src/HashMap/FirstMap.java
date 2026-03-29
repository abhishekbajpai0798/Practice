package HashMap;

import java.util.HashMap;

//  int arr[]={2,3,2,5,9,8,3}; //how to add the freq of any given array
public class FirstMap {
    public static void main(String[] args) {
        int arr[]={2,3,2,5,9,8,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int n = arr.length;
        for (int i=0; i<n; i++){
            int val = arr[i];
            if(map.containsKey(val)){
                int gf = map.get(val); //2
                int of = gf+1; //3
                map.put(val, of);// <2, 3>
            }
            else{
                map.put(val,1);
            }
        }
        System.out.println(map);
        for (int i=0; i<n; i++){
            int val = arr[i];
            map1.put(val, map1.getOrDefault(val,0)+1);
        }
        System.out.println(map1);
    }
}
