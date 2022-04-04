package arrays;


public class LinkedListNode {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode newNode = new ListNode(0);

        ListNode node = newNode;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;

            node.next = new ListNode(sum % 10);

            node = node.next;

            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return newNode.next;
    }
}
