package HashMap;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int target=9;

        int ans[]=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]= map.get(target-nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}
