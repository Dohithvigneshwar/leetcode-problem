public class Surrounded_Regions {
    class Solution {
        public void solve(char[][] board) {
            boolean visited[][] = new boolean[board.length][board[0].length];
            for(int i=0;i<board.length;i++){
                if(board[i][0] == 'O' && !visited[i][0]) dfs(board,visited,i,0);
            }
            for(int i=0;i<board.length;i++){
                if(board[i][board[0].length-1] == 'O' && !visited[i][board[0].length-1]) dfs(board,visited,i,board[0].length-1);
            }
            for(int i=0;i<board[0].length;i++){
                if(board[0][i] == 'O' && !visited[0][i]) dfs(board,visited,0,i);
            }
            for(int i=0;i<board[0].length;i++){
                if(board[board.length-1][i] == 'O' && !visited[board.length-1][i]) dfs(board,visited,board.length-1,i);
            }
            for(int i=1;i<board.length-1;i++){
                for(int j=1;j<board[0].length-1;j++){
                    if(board[i][j] == 'O' && !visited[i][j]) board[i][j] = 'X';
                }
            }
        }
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        private void dfs(char board[][],boolean visited[][],int i,int j){
            if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == 'X' || visited[i][j]) return;
            visited[i][j] = true;
            for(int d[] : dir) dfs(board,visited,i+d[0],j+d[1]);
        }
    }
}
