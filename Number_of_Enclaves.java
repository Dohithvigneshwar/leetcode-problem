public class Number_of_Enclaves {
    class Solution {
        public int numEnclaves(int[][] board) {
            boolean visited[][] = new boolean[board.length][board[0].length];
            for(int i=0;i<board.length;i++){
                if(board[i][0] == 1 && !visited[i][0]) dfs(board,visited,i,0);
            }
            for(int i=0;i<board.length;i++){
                if(board[i][board[0].length-1] == 1 && !visited[i][board[0].length-1]) dfs(board,visited,i,board[0].length-1);
            }
            for(int i=0;i<board[0].length;i++){
                if(board[0][i] == 1 && !visited[0][i]) dfs(board,visited,0,i);
            }
            for(int i=0;i<board[0].length;i++){
                if(board[board.length-1][i] == 1 && !visited[board.length-1][i]) dfs(board,visited,board.length-1,i);
            }
            int count = 0;
            for(int i=1;i<board.length-1;i++){
                for(int j=1;j<board[0].length-1;j++){
                    if(board[i][j] == 1 && !visited[i][j]) count++;
                }
            }
            return count;
        }
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        private void dfs(int board[][],boolean visited[][],int i,int j){
            if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == 0 || visited[i][j]) return;
            visited[i][j] = true;
            for(int d[] : dir) dfs(board,visited,i+d[0],j+d[1]);
        }
    }
}
