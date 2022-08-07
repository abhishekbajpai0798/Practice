package Array;
//space optimize version of frog jump in dp.
// link: https://takeuforward.org/data-structure/dynamic-programming-frog-jump-dp-3/
import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=6;
        int ans=solve(arr,n);
        System.out.println(ans);
    }
    private static int solve(int[] arr, int n) {
        int prev1=0;
        int prev2=0;
        for(int i=1; i<n; i++){
            int left=prev1+Math.abs(arr[i]-arr[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1) right=prev2+Math.abs(arr[i]-arr[i-2]);
            int cur=Math.min(left,right);
            prev2=prev1;
            prev1=cur;
        }
        return prev1;
    }
}
