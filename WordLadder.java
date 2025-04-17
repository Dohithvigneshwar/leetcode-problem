import java.util.*;
public class WordLadder {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<Pair> queue = new LinkedList<>();
            Set<String> list = new HashSet<>();
            for(String w : wordList) list.add(w);
            queue.add(new Pair(beginWord,1));
            while(!queue.isEmpty()){
                Pair rem = queue.remove();
                String word = rem.word;
                int count = rem.count;
                if(word.equals(endWord)) return count;
                for(int i=0;i<word.length();i++){
                    char c = 'a';
                    for(int j=0;j<26;j++){
                        String newword = word.substring(0,i)+c+word.substring(i+1);
                        if(list.contains(newword)){
                            list.remove(newword);
                            queue.add(new Pair(newword,count+1));
                        }
                        c++;
                    }
                }
            }
            return 0;
        }
        class Pair{
            int count;
            String word;
            public Pair(String word,int count){
                this.word = word;
                this.count = count;
            }
        }
    }
}
