package DP;
import java.util.*;
public class SubSetSum {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,10};
        int sum=11;
        int n= arr.length+1;
        int w= sum+1;
        boolean dp[][]=new boolean[n][w];
        boolean ans=findSum(arr,sum,dp);
        System.out.println(ans);
    }

    private static boolean findSum(int[] arr, int sum, boolean[][] dp) {
        //initialization of dp
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
        for(int i=0; i<n+1; i++){
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[n][sum];
    }

}
