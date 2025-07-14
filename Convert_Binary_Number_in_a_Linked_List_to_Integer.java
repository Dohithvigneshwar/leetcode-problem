public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
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
        public int getDecimalValue(ListNode head) {
            head = reverse(head);
            long cur = 1;
            int ans = 0;
            while(head != null){
                if(head.val == 1) ans += (int)cur;
                if(cur == 1){
                    cur = 2;
                }
                else{
                    cur = cur*2;
                }
                head = head.next;
            }
            return ans;
        }
        private ListNode reverse(ListNode head){
            if(head == null) return null;
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = head.next;
            while(cur!=null){
                cur.next = pre;
                pre = cur;
                cur = next;
                if(next != null) next = next.next;
            }
            return pre;
        }
    }
}
