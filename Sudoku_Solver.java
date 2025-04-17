public class Sudoku_Solver {
    class Solution {
        public void solveSudoku(char[][] board) {
            solve(board);
        }
        public boolean solve(char board[][]){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(board[i][j] == '.'){
                        for(int v = 1; v <= 9;v++){
                            if(isValid(board,i,j,v)){
                                board[i][j] =(char)('0'+v);
                                if(solve(board)){
                                    return true;
                                }
                                board[i][j] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        public boolean isValid(char board[][],int x,int y,int v){
            for(int i=0;i<9;i++){
                if(board[x][i]-'0' == v){
                    return false;
                }
                if(board[i][y]-'0' == v){
                    return false;
                }
            }
            int r = 3*(x/3);
            int c = 3*(y/3);
            for(int i=r;i<r+3;i++){
                for(int j=c;j<c+3;j++){
                    if(board[i][j]-'0' == v){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
