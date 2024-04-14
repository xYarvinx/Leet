package AddTwoNumbers_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            p = (p != null) ? p.next : null;
            q = (q != null) ? q.next : null;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
