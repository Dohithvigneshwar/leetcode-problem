public class Word_Search {
    class Solution {
        public boolean exist(char[][] board, String word) {
            boolean flag = false;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j] == word.charAt(0)){
                        boolean varray[][] = new boolean[board.length][board[0].length];
                        flag = dfs(board,varray,i,j,"",word);
                        if(flag){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        public boolean dfs(char board[][],boolean varray[][],int i,int j,String p,String word){
            if(p.length()>1 && p.charAt(p.length()-1) != word.charAt(p.length()-1)){
                if(p.length() == word.length()){
                    return true;
                }
                return false;
            }
            if(i>=0 && i<board.length && j>=0 && j<board[0].length && !varray[i][j]){
                varray[i][j] = true;
                if(dfs(board,varray,i,j+1,p+board[i][j],word)) return true;
                if(dfs(board,varray,i,j-1,p+board[i][j],word)) return true;
                if(dfs(board,varray,i+1,j,p+board[i][j],word)) return true;
                if(dfs(board,varray,i-1,j,p+board[i][j],word)) return true;
                varray[i][j] = false;
            }
            return false;
        }
    }
}
