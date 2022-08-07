package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
       int m=3;
       int n=7;
       int ans=uniquePaths(m,n);
        System.out.println("No. of Unique Path :"+ans);
    }
    public static int uniquePaths(int m, int n) {

        int dp[][]=new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0; i<m; i++){
            System.out.println(Arrays.toString(dp[i]));
        }

        int ans=countPath(0,0,m,n,dp);
        return ans;

    }
    public static int countPath(int i, int j, int m, int n,int dp[][]){
        if(i==m-1 && j==n-1){
            return 1;
        }if((i>=m || j>=n)){
            return 0;
        }if(dp[i][j]!=-1) return dp[i][j];
        else{
            int down=countPath(i+1,j,m,n,dp);
            int right=countPath(i,j+1,m,n,dp);
            return dp[i][j]=down+right;
        }


    }
}
