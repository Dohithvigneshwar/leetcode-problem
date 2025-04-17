import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    class Solution {
        List<List<String>> list = new ArrayList<>();
        public List<List<String>> solveNQueens(int n) {
            if(n==0){
                return list;
            }
            char board[][] = new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j] = '.';
                }
            }
            placeQueen(board,0,n);
            return list;
        }
        public void placeQueen(char board[][],int r,int n){
            if(r == n){
                List<String> l = new ArrayList<>();
                for(char e[]:board){
                    l.add(new String(e));
                }
                list.add(l);
                return;
            }
            for(int col = 0; col< n; col++){
                if(isSafe(r,col,board)){
                    board[r][col] = 'Q';
                    placeQueen(board,r+1,n);
                    board[r][col] = '.';
                }

            }
        }
        public boolean isSafe(int x,int y,char[][] board){
            for(int i=x-1;i>=0;i--){
                if(board[i][y] == 'Q') return false;
            }
            int i = x-1;
            int j = y-1;
            while(i>=0 && j>=0){
                if(board[i][j] == 'Q') return false;
                i--;
                j--;
            }
            i=x-1;
            j=y+1;
            while(i>=0 && j<board.length){
                if(board[i][j] == 'Q') return false;
                i--;
                j++;
            }
            return true;
        }
    }
}
