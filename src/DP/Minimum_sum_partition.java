package DP;

import java.util.Arrays;

public class Minimum_sum_partition {
    public static void main(String[] args) {
        int arr[]={1, 6, 11, 5};
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        int n= arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        subSetSum(arr,sum,dp);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0; i<=sum/2; i++){
            if(dp[n][i]==true){
                minDiff=Math.min(minDiff,sum-2*i);
            }
        }
        System.out.println(minDiff);
    }

    private static void subSetSum(int[] arr, int sum, boolean[][] dp) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false;
        }

        // checking for other elements and sum possibilities
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i-1]<=j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }
}
