/** 
Definition for singly-linked list.
public class listNode {
    int val; 
    ListNode next;
    ListNode(int x) { val = x }
}
*/

// LeetCode problem 24. Swap Nodes in Pairs

class Solution {
    public ListNode swapPairs(ListNode head) {
        // Set up dummy node to point to the head of the list 
        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        ListNode runner = dummy; 

        // Looking for pairs moving 2 at a time 
        // Check to make sure there is a pair at our current position. 
        while (runner.next != null && runner.next.next != null) {
            // Set up two temporary pointers to help with reference swapping. 
            ListNode rl = runner.next; 
            ListNode r2 = runner.next.next;

            // Need at least 3 nodes to make the swap 
            // Do the three swaps to reverse this pair. 
            runner.next = r2;  
            r1.next = r2.next;
            r2.next = r1; 

            // Move to the next pair
            runner = runner.next.next; 

        }

        return dummy.next;
    }
}
         