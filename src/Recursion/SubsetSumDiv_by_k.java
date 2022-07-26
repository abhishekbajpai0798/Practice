package Recursion;

import java.util.ArrayList;

public class SubsetSumDiv_by_k {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        subSetSum(0,list,arr, arr.length, sum, k);
    }

    private static void subSetSum(int idx, ArrayList<Integer> ans, int arr[], int n, int sum, int k) {
        if(idx==n){
            if(ans.size()!=0 && sum%k==0)
                System.out.println(ans);
            return;
        }
        //pick the element and add it into ds.
        ans.add(arr[idx]);
        sum+=arr[idx];
        subSetSum(idx+1, ans, arr, n, sum,k);

        //after traverse to the last we need to clear the DS for the next call
        ans.remove(ans.size()-1);
        sum-=arr[idx];
        //not pick
        subSetSum(idx+1, ans, arr, n, sum,k);
    }
}
