package Recursion;

public class UniquePathRecursive {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int ans=uniquePaths(m,n);
        System.out.println(ans);
    }
    public static int uniquePaths(int m, int n) {
        int ans=countPath(0,0,m,n);
        return ans;
    }
    public static int countPath(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }if((i>=m || j>=n)){
            return 0;
        }
        int down=countPath(i+1,j,m,n);
        int right=countPath(i,j+1,m,n);
        return down+right;
    }
}
