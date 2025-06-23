public class RemoveNthNode_From_End_ofList {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first = head;
            int len = length(head);
            if(len == n) return head.next;
            int mov = len - n-1;
            for(int i=0;i<mov;i++){
                first = first.next;
            }
            first.next = first.next.next;
            return head;
        }
        public int length(ListNode head){
            int size = 0;
            ListNode node = head;
            while(node!=null){
                node = node.next;
                size++;
            }
            return size;
        }
    }
}
