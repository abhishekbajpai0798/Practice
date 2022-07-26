package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class FindAllSubArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        subArray(0,list,arr, arr.length);
    }

    private static void subArray(int idx, ArrayList<Integer> ans, int[] arr, int n) {
        if(idx==n){
            System.out.println(ans);
            return;
        }
        //pick the element and add it into ds.
        ans.add(arr[idx]);

        subArray(idx+1, ans, arr, n);

        //after traverse to the last we need to clear the DS for the next call
        ans.remove(ans.size()-1);

        //not pick
        subArray(idx+1, ans, arr, n);
    }
}
