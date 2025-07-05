import java.util.ArrayList;
import java.util.List;

public class Word_Search_II {
    class Solution {
        private Node root;
        private class Node{
            Node[] data = new Node[26];
            boolean isEnd;
        }
        private void formTree(String word){
            Node node = root;
            for(int i=0;i<word.length();i++){
                int c = word.charAt(i)-'a';
                if(node.data[c] == null){
                    node.data[c] = new Node();
                }
                node = node.data[c];
            }
            node.isEnd = true;
        }
        private void dfs(Node node, int i, int j, boolean[][] visited, char[][] board, StringBuffer path, List<String> res){
            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j]) return;
            char c = board[i][j];
            if(node.data[c-'a'] == null) return;
            path.append(""+c);
            node = node.data[c-'a'];
            if(node.isEnd){
                res.add(path.toString());
                node.isEnd = false;
            }
            visited[i][j] = true;
            dfs(node,i+1,j,visited,board,path,res);
            dfs(node,i-1,j,visited,board,path,res);
            dfs(node,i,j-1,visited,board,path,res);
            dfs(node,i,j+1,visited,board,path,res);
            path.deleteCharAt(path.length()-1);
            visited[i][j] = false;
        }
        public List<String> findWords(char[][] board, String[] words) {
            root = new Node();
            for(String e : words){
                formTree(e);
            }
            int n = board.length;
            int m = board[0].length;
            boolean visited[][] = new boolean[n][m];
            List<String> res = new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dfs(root,i,j,visited,board,new StringBuffer(),res);
                }
            }
            return res;
        }
    }
}
