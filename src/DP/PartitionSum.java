package DP;

import java.util.Arrays;

/*
Given a non-empty array nums containing only positive integers
find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
*/
public class PartitionSum {
    public static void main(String[] args) {
        int arr[]={2,3,3,3,4,5};
        int n= arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int target=sum/2;
        int dp[][]= new int[n][target+1];
        for (int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        for (int i=0; i<n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        if(sum%2!=0){
            System.out.println(false);
        }
        else{
            boolean ans=getPartition(n-1,arr,target,dp);
            System.out.println(ans);
        }
        for (int i=0; i<n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    private static boolean getPartition(int idx, int[] arr, int target,int dp[][]) {
        int n= arr.length;

        //System.out.println(target);
        if(target==0){
            return true;
        }
        if(idx==0){
            return arr[idx]==target;
        }

        if(dp[idx][target]!=-1){
            return dp[idx][target]==0?true:false;
        }

        boolean pick=false;
        if(arr[idx]<=target){
            pick=getPartition(idx-1, arr,target-arr[idx],dp);
        }
        boolean notPick=getPartition(idx-1, arr,target,dp);
        dp[idx][target]= pick||notPick?1:0;
        return pick||notPick;
    }
}
