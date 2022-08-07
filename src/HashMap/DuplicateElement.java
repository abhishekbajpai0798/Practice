package HashMap;
import java.util.*;
public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]={2,3,2,5,9,8,3};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int of=map.get(arr[i]);
                int nf=of+1;
                map.put(arr[i], nf);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        for(int key: map.keySet()){
            if(map.get(key)==1){
               list.add(key);
            }
        }
        System.out.println(list);
    }
}
