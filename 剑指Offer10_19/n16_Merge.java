package 剑指Offer10_19;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则.
 */

/**
 * @author HanYehong
 *
 *Time:2018-9-4
 */
public class n16_Merge {
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        if(list1 == null){
	            return list2;
	        }
	        if(list2 == null){
	            return list1;
	        }
	        ListNode ln_pre = list1;
	        ListNode ln_now = list1;
	        ListNode return_node = list1;
	        int i = 1;
	        while((list2 != null) && (ln_now != null)){
	            if(list2.val<=ln_now.val){
	                if(i == 1){
	                    ListNode new_node = new ListNode(list2.val);
	                    //          ln_pre.next = new_node;
	                    new_node.next = ln_now;
	                    return_node = new_node;
	                    ln_pre = new_node;
	                    list2 = list2.next;
	                    i++;
	                }else {
	                    ListNode new_node = new ListNode(list2.val);
	                    ln_pre.next = new_node;
	                    new_node.next = ln_now;
	                    ln_now = new_node;
	                    list2 = list2.next;
	                }

	            }else{
	                if(i==1){
	                    ln_now = ln_now.next;
	                    i++;
	                }else{
	                    ln_now = ln_now.next;
	                    ln_pre = ln_pre.next;
	                }

	            }
	        }
	        if(list2!=null){
	            ln_pre.next = new ListNode(list2.val);
	        }
	        return return_node;
	    }

}
