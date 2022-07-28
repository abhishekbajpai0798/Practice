package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInMaze1 {
    public static void main(String[] args) {
        int arr[][]={{1, 0, 0, 0},
                     {1, 1, 0, 1},
                     {1, 1, 0, 0},
                     {0, 1, 1, 1}};
        int n=4;
        int visited[][]=new int[n][n];
        //fill visited matrix with zero to show as path is not visited yet.
       /* for(int i=0; i<n; i++){
            Arrays.fill(visited[i],0);
        }*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = 0;
            }
        }
        if(arr[0][0]==1){
            ArrayList<String> ans= new ArrayList<>();
            solve(0, 0, arr, n, ans, "", visited);
            System.out.println(ans);
        }
        else{
            System.out.println("Unable to find the path");
        }

    }
    private static void solve(int i, int j, int a[][], int n, ArrayList < String > ans, String move, int vis[][]) {
        //given moves are D/L/R/U
        //base condition
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }

       //down move

        if (i + 1 < n && vis[i + 1][j] == 0 && a[i + 1][j] == 1) {
            vis[i][j] = 1;
            solve(i + 1, j, a, n, ans, move + 'D', vis);
            vis[i][j] = 0;
        }

        // left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && a[i][j - 1] == 1) {
            vis[i][j] = 1;
            solve(i, j - 1, a, n, ans, move + 'L', vis);
            vis[i][j] = 0;
        }

        // right
        if (j + 1 < n && vis[i][j + 1] == 0 && a[i][j + 1] == 1) {
            vis[i][j] = 1;
            solve(i, j + 1, a, n, ans, move + 'R', vis);
            vis[i][j] = 0;
        }

        // upward
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && a[i - 1][j] == 1) {
            vis[i][j] = 1;
            solve(i - 1, j, a, n, ans, move + 'U', vis);
            vis[i][j] = 0;
        }

    }
}
