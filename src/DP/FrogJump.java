package DP;

import java.util.Arrays;

//task is to find the minimum absolute energy where frog is reached to the end.
public class FrogJump {
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=6;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(arr,n-1, dp);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int idx, int dp[]) {
        if(idx==0)
            return 0;
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int left=solve(arr,idx-1, dp)+Math.abs(arr[idx]-arr[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1) right=solve(arr,idx-2, dp)+Math.abs(arr[idx]-arr[idx-2]);
        return dp[idx]=Math.max(left,right);
    }
}
