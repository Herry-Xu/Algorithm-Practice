/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev, current, head;
        head = prev = new ListNode(0);
        int carry = 0, sum, digit;
        
        while (l1 != null || l2 != null || carry != 0){
            sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            digit = sum % 10 ;
            current = new ListNode(digit);
            carry = sum / 10;
            prev.next = current;
            prev = current;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}
