package Recursion;

public class CountSubarraySum_div_by_k {
    public static void main(String[] args) {
        int arr[]={3, 1, 7, 5};
        int k=6;
        int sum=0;
        int ans=countSum(0,arr,sum,arr.length,k);   
        System.out.println(ans);
    }

    private static int countSum(int i, int[] arr, int sum, int length, int k) {
        if(i==length) {
            if (sum % k == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        sum+=arr[i];
        int left=countSum(i+1, arr, sum, length, k);
        sum-=arr[i];
        int right=countSum(i+1, arr, sum, length, k);
        return left+right;
    }
}
