/**  
Definition for singly-linked list.
public class listNode {
    int val; 
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
}
*/

// LeetCode problem 19. Remove Nth Node From End of List ( Java Solution )

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n ) {
        // Set up dummy node to point to the head of the list 
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Set up walker and runner to start at the dummy node 
        ListNode walker = dummy; 
        ListNode runner = dummy; 

        // Advance runner so that the distance between w&r is n+1 
        for (int i = 1; 1 <= n + 1; i++) {
            runner = runner.next; 
        }

        // Move the runner to the end, maintaining the gap 
        while(runner != null) {
            runner = runner.next; 
            walker = walker.next; 
        }

        // Delete the n-th node from the end (walker is currently at the n-1 node)
        walker.next = walker.next.next;
        return dummy.next; 
    }
}