import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Properties_Graph {
    class Solution {
        public int numberOfComponents(int[][] properties, int k) {
            ArrayList<Integer>[] graph = new ArrayList[properties.length];
            for(int i=0;i<graph.length;i++) graph[i] = new ArrayList<>();
            for(int i=0;i<properties.length;i++){
                for(int j=i+1;j<properties.length;j++){
                    if (intersect(properties[i], properties[j]) >= k) {
                        graph[i].add(j);
                        graph[j].add(i);
                    }
                }
            }
            boolean varray[] = new boolean[properties.length];
            int count = 0;
            for(int i=0;i<varray.length;i++){
                if(!varray[i]){
                    dfs(graph,varray,i);
                    count++;
                }
            }
            return count;

        }
        public void dfs(ArrayList<Integer>[] graph,boolean varray[],int start){
            varray[start] = true;
            for(int e : graph[start]){
                if(!varray[e]) dfs(graph,varray,e);
            }
        }
        public ArrayList<Integer> valid(int a[],int b[],int k){
            ArrayList<Integer> connection = new ArrayList<>();
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b.length;j++){
                    if(a[i] == b[i]){
                        if(a[i]>=k){
                            connection.add(a[i]);
                        }
                    }
                }
            }
            return connection;
        }
        public int intersect(int[] a, int[] b) {
            Set<Integer> setA = new HashSet<>();
            for (int num : a) {
                setA.add(num);
            }
            int count = 0;
            Set<Integer> counted = new HashSet<>();
            for (int num : b) {
                if (setA.contains(num) && !counted.contains(num)) {
                    count++;
                    counted.add(num);
                }
            }
            return count;
        }
    }
}
