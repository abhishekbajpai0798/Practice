package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
       int arr[]={1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        subSeq(0,list,arr, arr.length);

    }
    public static void subSeq(int idx, ArrayList<Integer> ans, int arr[], int n){
        if (idx==n){
            System.out.println(ans);
            return;
        }
        //pick the element and add it into ds.
        ans.add(arr[idx]);
        subSeq(idx+1, ans, arr, n);
        //after traverse to the last we need to clear the DS for the next call
        ans.remove(ans.size()-1);
        //not pick
        subSeq(idx+1, ans, arr, n);
    }

}
