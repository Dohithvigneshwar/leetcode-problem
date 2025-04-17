public class Merge_Two_Sorted_Lists {
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null && list2 == null){
                return null;
            }
            ListNode dummyhead = new ListNode();
            ListNode tail = dummyhead;
            ListNode head1 = list1;
            ListNode head2 = list2;
            while(head1 != null && head2!=null){
                if(head1.val<head2.val){
                    tail.next = new ListNode(head1.val);
                    tail = tail.next;
                    head1 = head1.next;
                }
                else{
                    tail.next = new ListNode(head2.val);
                    tail = tail.next;
                    head2 = head2.next;
                }
            }
            if(head1!=null){
                tail.next = head1;
            }
            if(head2!=null){
                tail.next = head2;
            }
            return dummyhead.next;
        }
    }
}
