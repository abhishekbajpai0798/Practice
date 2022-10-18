package DP;

import java.util.Arrays;

public class CountSubSetWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {0,0,1};
        int target=1;

        int n = arr.length;
        int dp[][]=new int[n][target+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        System.out.println("The number of subset found is "+solve(n-1,target,arr,dp));
    }
    static int solve(int ind, int target, int[] arr,int[][] dp){
        if(ind == 0){
            if(target==0 && arr[0]==0)
                return 2;
            if(target==0 || target == arr[0])
                return 1;
            return 0;
        }

        if(dp[ind][target]!=-1)
            return dp[ind][target];

        int notTaken = solve(ind-1,target,arr,dp);

        int taken = 0;
        if(arr[ind]<=target)
            taken = solve(ind-1,target-arr[ind],arr,dp);

        return dp[ind][target]= (notTaken + taken);
    }
}

