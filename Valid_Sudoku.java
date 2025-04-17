public class Valid_Sudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            if(solve(board)){
                return true;
            }
            return false;
        }
        public boolean solve(char board[][]){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(board[i][j] != '.'){
                        if(!isValid(board,i,j,board[i][j])){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        public boolean isValid(char board[][],int x,int y,char v){
            for(int i=0;i<9;i++){
                if(i !=y && board[x][i] == v){
                    return false;
                }
                if(i!=x && board[i][y] == v){
                    return false;
                }
            }
            int r = 3*(x/3);
            int c = 3*(y/3);
            for(int i=r;i<r+3;i++){
                for(int j=c;j<c+3;j++){
                    if( i== x && j==y){
                        continue;
                    }
                    if(board[i][j] == v){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
