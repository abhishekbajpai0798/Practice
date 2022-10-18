package DP;

public class KanpSack_Recusive {
    public static void main(String[] args) {
        int N = 3;
        int W = 4;
        int values[] = {1,2,3};
        int weight[] = {4,5,1};
        System.out.println(knapSack(W,weight,values,N));
    }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int ans=solve(W,wt,val,n);
        return ans;
    }
    static int solve(int W, int wt[], int val[], int n){
        if(n==0 || W==0){
            return 0;
        }
        int notPick=solve(W,wt,val,n-1);
        int pick=Integer.MIN_VALUE;
        if(wt[n-1]<=W){
            pick=val[n-1]+solve(W-wt[n-1],wt,val,n-1);
        }
        return Math.max(pick,notPick);
    }

}
