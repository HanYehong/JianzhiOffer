/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

/**
 * @author HanYehong
 * 
 * 2018年8月5日
 */

package 剑指Offer10_19;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class n14_FindKthToTail {
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if( head == null) {
			return null;
		}
		ListNode tempNode = head;
		int len = 0;
		while(tempNode != null) {
			len++;
			tempNode = tempNode.next;
		}
		if(k>len) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		tempNode = head;
		int i = 0;
		while(true) {
			if(i==len-k) {
				return tempNode;
			}
			tempNode = tempNode.next;
			i++;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
