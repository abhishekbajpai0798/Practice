package HashMap;

import java.util.HashMap;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[]= {10,5,9,1,11,8,6,15,3,12,2};
        HashMap<Integer,Boolean> map= new HashMap<>();
        for (int val: arr){
            map.put(val,true);
        }
        for (int val:arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        int maxLen=0;
        int startptr=0;
        for (int val:arr){
            if(map.get(val)==true){
                int currLen=1;
                int tempPtr=val;
                while(map.containsKey(tempPtr+currLen)){
                    currLen++;
                }
                if(currLen>maxLen){
                    maxLen=currLen;
                    startptr=tempPtr;
                }
            }
        }
        System.out.println(startptr+" "+maxLen);
    }
}
