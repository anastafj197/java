/** 
Floyd's cycle finding algorithm
 
Set up walker and runner 
move walker 1 node at a time 
move runner 2 nodes at a time 
if runner reaches null node then theres no cycle 
if the runner and walker collide 
     Leave runner & move walker back to the 1st node
     Move each of them one step at a time together
the next time Walker and Runner colide will be where the cycle begins 
*/

/** 
Definition for singly-linked list.
public class listNode {
    int val; 
    ListNode next;
    ListNode(int x) { val = x }
}
*/

// LeetCode problem 142. Linked List Cycle II ( Java Solution )

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode walker = head;
        ListNode runner = head;
        boolean isCycle = false; 

        while (walker != null && runner != null) {
            walker = walker.next;

            // Move the runner two nodes at a time
            if (runner.next == null) return null;
            runner = runner.next.next

            if (walker == runner) {
                isCycle = true;
                break;
            }
        }

        // If there is not cycle, nothing further needed. Otherwise, find the node
        if(isCylce)
            return null;
        else {
            walker = head;
            // the next time Walker and Runner colide will be where the cycle begins
            while (walker != runner) {
                walker = walker.next;
                runner = runner.next; 
            }
            return walker; 
        }
    }
}