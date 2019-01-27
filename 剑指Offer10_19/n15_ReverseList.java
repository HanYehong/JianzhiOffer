/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */

/**
 * @author HanYehong
 * 
 * 2018年8月5日
 */

package 剑指Offer10_19;

public class n15_ReverseList {
	public ListNode ReverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		ListNode node = new ListNode(head.val);
		ListNode nodePre = head.next;
		while(nodePre.next!=null) {
			ListNode temp = new ListNode(nodePre.val);
			temp.next = node;
			node = temp;
			nodePre = nodePre.next;
		}
		ListNode temp = new ListNode(nodePre.val);
		temp.next = node;
		return temp;

    }

}
