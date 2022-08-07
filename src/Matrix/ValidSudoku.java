package Matrix;

import java.util.*;


public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        boolean ans = isValidSudoku(board);
        System.out.println(ans);

    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> map = new HashSet<>();

        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                if(board[i][j] != '.') {

                    String row = board[i][j] + " row " + i;
                    String col = board[i][j] + " col " + j;
                    String box = board[i][j] + " box " + i/3 + "and" + j/3;

                    if(!map.add(row)|| !map.add(col) || !map.add(box))
                        return false;
                }
        System.out.println(map);

        return true;
    }
}
