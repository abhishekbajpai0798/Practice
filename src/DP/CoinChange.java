package DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int coin[]={7,8,6};
        int n=18;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans=minCoin(n,coin,dp);
        if(ans==Integer.MAX_VALUE){
            System.out.println("Ans not possible");
        }
        System.out.println("Ans found: "+ans);
    }
    public static int minCoin(int n,int coin[],int dp[]){
        if(n==0) return 0;
        int minAns=Integer.MAX_VALUE;
        for(int i=0; i<coin.length; i++){
            if(n-coin[i]>=0){
                int ans=0;
                if(dp[n-coin[i]]!=-1){
                    ans=dp[n-coin[i]];
                }else{
                    ans=minCoin(n-coin[i],coin,dp);
                }
                if(ans!=Integer.MAX_VALUE){
                    minAns=Math.min(minAns,ans+1);
                }
            }
        }
        dp[n]=minAns;
        return minAns;
    }
}
