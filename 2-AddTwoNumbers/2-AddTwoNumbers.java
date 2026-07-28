// Last updated: 7/28/2026, 5:48:29 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummyHead = new ListNode(0); // Holds the start of the result
14        ListNode curr = dummyHead;           // Pointer to build the new list
15        int carry = 0;
16
17        // Keep going as long as there are digits left OR a carry to place
18        while (l1 != null || l2 != null || carry != 0) {
19            int x = (l1 != null) ? l1.val : 0;
20            int y = (l2 != null) ? l2.val : 0;
21
22            int sum = x + y + carry;
23            carry = sum / 10; // Extract carry (e.g. 13 / 10 = 1)
24
25            // Attach new digit node
26            curr.next = new ListNode(sum % 10);
27            curr = curr.next;
28
29            // Advance pointers if possible
30            if (l1 != null) l1 = l1.next;
31            if (l2 != null) l2 = l2.next;
32        }
33
34        return dummyHead.next; // Skip the dummy node
35    }
36}