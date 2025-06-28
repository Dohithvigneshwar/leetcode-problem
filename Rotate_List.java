public class Rotate_List {
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
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null || k==0) return head;
            int size = len(head);
            k = k%size;
            if(k == 0) return head;
            ListNode oldhead = head;
            ListNode newtail = head;
            for(int i=1;i<size-k;i++){
                newtail = newtail.next;
            }
            ListNode newhead = newtail.next;
            newtail.next = null;
            ListNode tail = newhead;
            while(tail.next!=null) tail = tail.next;
            tail.next = oldhead;
            return newhead;

        }
        private int len(ListNode head){
            int size = 0;
            ListNode temp = head;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            return size;
        }
    }
}
