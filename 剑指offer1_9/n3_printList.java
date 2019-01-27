/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

/**
 *@author HanYehong
 *
 * 2018年6月27日
 */

package 剑指offer1_9;

import java.util.*;

class ListNode  
{  
    int val;  
    ListNode next;  
      
    public ListNode(int x){  
        val=x;  
    }  
}  

public class n3_printList {
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		ListNode temp = listNode;
		while ( temp != null ) {
			list.add( temp.val );
			temp = temp.next;
		}
		for ( int i = list.size()-1; i>=0; i-- ) {
			result.add( list.get(i) );
		}
		return result;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		one.next = two;
		two.next = three;
		l.add(one.val);
		l.add(two.val);
		l.add(three.val);
		System.out.println(one.next.val);
		
		ArrayList<Integer> list = new n3_printList().printListFromTailToHead(one);
		
		System.out.println(list);
	}

}
