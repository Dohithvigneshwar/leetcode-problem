import java.util.ArrayList;

public class Number_of_Provinces {
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            ArrayList<ArrayList<Integer>> graph = buildgraph(isConnected);
            System.out.println(graph);
            int count = 0;
            boolean varray[] = new boolean[graph.size()];
            for(int i=0;i<varray.length;i++){
                if(!varray[i]){
                    dfs(graph,varray,i);
                    count++;
                }
            }
            return count;
        }
        public void dfs(ArrayList<ArrayList<Integer>> graph,boolean varray[],int node){
            varray[node] = true;
            for(int e:graph.get(node)){
                if(!varray[e]){
                    dfs(graph,varray,e);
                }
            }
        }
        public ArrayList<ArrayList<Integer>> buildgraph(int a[][]){
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>(a.length);
            for(int i=0;i<a.length;i++){
                graph.add(new ArrayList<>());
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    if(a[i][j]==1) graph.get(i).add(j);
                }
            }
            return graph;
        }
    }
}
