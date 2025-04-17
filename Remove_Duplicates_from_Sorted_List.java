public record Remove_Duplicates_from_Sorted_List() {

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode node = head;
            while(node.next!=null){
                if(node.val == node.next.val){
                    node.next = node.next.next;
                    continue;
                }
                node = node.next;
            }
            return head;
        }
        // private ListNode remove(ListNode node,Set<Integer> set){
        //     if(node == null){
        //         return null;
        //     }
        //     if(set.contains(node.val)){
        //         return remove(node.next,set);
        //     }
        //     set.add(node.val);
        //     node.next = remove(node.next,set);
        //     return node;
        // }
    }
}
