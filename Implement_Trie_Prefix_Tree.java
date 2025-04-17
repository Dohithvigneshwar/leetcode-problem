public class Implement_Trie_Prefix_Tree {
    class Trie {
        class Node{
            boolean end;
            Node children[] = new Node[26];
        }
        Node root;
        public Trie() {
            root = new Node();
        }
        public void insert(String word) {
            Node temp = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i)-97;
                if(temp.children[index]==null) {
                    temp.children[index] = new Node();
                }
                temp = temp.children[index];
            }
            temp.end = true;
        }

        public boolean search(String word) {
            Node temp = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i) - 97;
                if(temp.children[index] == null){
                    return false;
                }
                temp = temp.children[index];
            }
            return temp.end;
        }

        public boolean startsWith(String word) {
            Node temp = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i) - 97;
                if(temp.children[index] == null){
                    return false;
                }
                temp = temp.children[index];
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
