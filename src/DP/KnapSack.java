package DP;

public class KnapSack {
    public static void main(String[] args) {
        int wt[] = {1,2,4,5};
        int val[] = {5,4,8,6};
        int W=5;

        int n = wt.length;

        System.out.println("The Maximum value of items, thief can steal is "+knapsack(wt,val,n,W));
    }

    //tabulation
    private static int knapsack(int[] wt, int[] val, int n, int W) {
        //BaseCase
        int dp[][]=new int[n+1][W+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<W+1; j++){
                if(n==0 || W==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int ind =1; ind<n+1; ind++){
            for(int cap=1; cap<W+1; cap++){
                int taken = Integer.MIN_VALUE;
                if(wt[ind-1] <= cap) {
                    taken = val[ind-1] + dp[ind - 1][cap - wt[ind-1]];
                }
                int notTaken = dp[ind-1][cap];
                dp[ind][cap] = Math.max(notTaken, taken);
            }
        }
        return dp[n][W];
    }
}
