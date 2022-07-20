package BackTracking;

import java.util.Scanner;

public class PrintQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int chess[][]= new int[n][n];
        printQueen(chess,"",0);
    }

    private static void printQueen(int[][] chess, String qsf, int row) {
        if(row== chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0; col < chess.length; col++){
            chess[row][col]=1;
            printQueen(chess, qsf+row+col +",", row+1);
            chess[row][col]=0;
        }
    }
}
