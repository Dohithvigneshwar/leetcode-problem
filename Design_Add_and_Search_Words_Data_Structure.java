public class Design_Add_and_Search_Words_Data_Structure {
    class WordDictionary {
        private Node root;

        private class Node {
            boolean isEnd = false;
            Node[] words = new Node[26];
        }

        public WordDictionary() {
            root = new Node();
        }

        public void addWord(String word) {
            Node node = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.words[index] == null) {
                    node.words[index] = new Node();
                }
                node = node.words[index];  // ✅ Move to next node
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            return searchHelper(word, 0, root);
        }

        private boolean searchHelper(String word, int i, Node root) {
            if (root == null) return false;
            if (i == word.length()) return root.isEnd;

            char c = word.charAt(i);
            if (c == '.') {
                for (int j = 0; j < 26; j++) {
                    if (root.words[j] != null && searchHelper(word, i + 1, root.words[j]))
                        return true;
                }
                return false;
            } else {
                int index = c - 'a';
                if (root.words[index] == null) return false;
                return searchHelper(word, i + 1, root.words[index]);
            }
        }
    }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
