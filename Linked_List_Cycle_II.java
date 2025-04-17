public class Linked_List_Cycle_II {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
         }
      }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null){
                return head;
            }
            ListNode first = head;
            ListNode second = head;
            while(second != null && second.next != null){
                second = second.next.next;
                first = first.next;
                if(second == first){
                    first = head;
                    while(first != second){
                        first = first.next;
                        second = second.next;
                    }
                    return first;
                }
            }
            return null;
        }
    }
}
