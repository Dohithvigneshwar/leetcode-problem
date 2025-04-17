import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_II {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i <= rowIndex; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        list.add(1);
                    } else {
                        List<Integer> temp = ans.get(i - 1);
                        int v = temp.get(j - 1) + temp.get(j);
                        list.add(v);
                    }
                }
                ans.add(list);
            }
            List<Integer> list = new ArrayList<>();
            return ans.get(rowIndex);
        }
    }
}
