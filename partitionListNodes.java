/** 
Definition for singly-linked list.
public class listNode {
    int val; 
    ListNode next;
    ListNode(int x) { val = x }
}
*/

// LeetCode problem 86. Partition List ( Java Solution )

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before_runner = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after_runner = after_head;

        while (head != null) {
            if (head.val < x) {
               before_runner.next = head;
               before_runner = before_runner.next; 
            }
            else {
                after_runner.next = head;
                after_runner = after_runner.next;
            }
            head = head.next;
        }

        after_runner.next = null;
        before_runner.next = after_runner.next;
        return before_head.next; 

    }
}