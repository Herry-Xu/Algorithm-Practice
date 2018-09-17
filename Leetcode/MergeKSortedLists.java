/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode partition(ListNode[] lists, int start, int end){
        if (lists.length == 0) return null;
        if (start == end) return lists[start];
        int mid = (start + end)/2;
        ListNode left = partition(lists, start, mid);
        ListNode right = partition(lists, mid+1, end);
        return mergeTwoLists(left, right);
    }
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        else if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else if (l1.val > l2.val){
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        
        return null;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0, lists.length - 1);
    }
}
