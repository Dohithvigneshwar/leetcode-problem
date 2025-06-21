public class Remove_Duplicates_from_Sorted_List_II {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode root = new ListNode(-101);
            ListNode tail = root;

            ListNode node = head;
            while(node!=null){
                boolean flag = false;
                while(node.next!=null){
                    if(node.val == node.next.val){
                        flag = true;
                        node = node.next;
                    }
                    else{
                        break;
                    }
                }
                if(flag){
                    node = node.next;
                    continue;
                }
                tail.next = new ListNode(node.val);
                tail = tail.next;
                node = node.next;
            }
            return root.next;
        }
    }
}
