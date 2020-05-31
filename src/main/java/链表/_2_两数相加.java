package 链表;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * 属于简单类型 只需要把各种情况考虑进去即可
 */
public class _2_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0);
        ListNode temp = newListNode;
        int carray = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = a + b + carray;
            newListNode.next = new ListNode(sum % 10);
            newListNode = newListNode.next;
            carray = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(carray>0)  newListNode.next = new ListNode(carray);
        return temp.next;
    }
}
