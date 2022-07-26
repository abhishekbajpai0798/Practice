package Recursion;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[]={2,4,6};
        int sum=0;
        int ans=countSum(arr,0,sum);
        System.out.println(ans);
    }
    public static int countSum(int arr[], int idx, int sum){
        if(idx==arr.length) {
            if (sum % 2 != 0) {
                return 1;
            } else {
                return 0;
            }
        }
        sum+=arr[idx];
        int left=countSum(arr,idx+1, sum);
        sum-=arr[idx];
        int right=countSum(arr,idx+1, sum);
        return left+right;
    }
}
