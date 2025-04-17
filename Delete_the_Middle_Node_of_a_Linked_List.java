public class Delete_the_Middle_Node_of_a_Linked_List {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {
         }
         ListNode(int val) {
             this.val = val;
         }
         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            ListNode tail = head;
            int count = 0;
            while(tail!=null){
                count++;
                tail = tail.next;
            }
            count = count/2;
            if(count == 0){
                return null;
            }
            ListNode tempHead = head;
            while(count!=1){
                count--;
                tempHead = tempHead.next;
            }
            tempHead.next = tempHead.next.next;
            return head;
        }
    }
}
