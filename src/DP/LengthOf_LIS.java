package DP;

import java.lang.reflect.Array;
import java.util.*;

public class LengthOf_LIS {
    public static void main(String[] args) {
        int arr[]={1,11,2,10,4,5,2,1};
        int n= arr.length;
        int maxLen=0;
        int dp[]=new int[n];
        Arrays.fill(dp,1);

        for(int i=0; i<n; i++){
            for(int prev=0; prev<i; prev++){
                if(arr[i]>arr[prev] && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                }
            }
            maxLen=Math.max(dp[i],maxLen);
        }
        System.out.println(maxLen);
    }
}
