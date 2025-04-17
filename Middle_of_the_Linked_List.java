public class Middle_of_the_Linked_List {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode tail = head;
            int count = 0;
            while(tail!=null){
                count++;
                tail = tail.next;
            }
            count = count/2;
            ListNode tempHead = head;
            while(count!=0){
                count--;
                tempHead = tempHead.next;
            }
            return tempHead;
        }
    }
}
