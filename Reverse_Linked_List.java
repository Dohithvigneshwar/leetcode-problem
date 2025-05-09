public class Reverse_Linked_List {

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode pre = null;
            ListNode present = head;
            ListNode next = head.next;
            while(present!=null){
                present.next = pre;
                pre = present;
                present = next;
                if(next!=null){
                    next = next.next;
                }
            }
            return pre;

        }
    }
}
