/**
 * ����һ��������ת��������������ı�ͷ��
 */

/**
 * @author HanYehong
 * 
 * 2018��8��5��
 */

package ��ָOffer10_19;

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
