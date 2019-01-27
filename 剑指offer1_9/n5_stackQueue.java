/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月28日
 */

package 剑指offer1_9;

import java.util.Stack;

public class n5_stackQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	reverse( stack1, stack2 );
    	Integer temp = null;
    	if ( !stack2.empty() ) {
    		temp = stack2.pop();
    		reverse( stack2 , stack1 );
    	}
    	
    	return temp;
    }
    
    public void reverse( Stack<Integer> stack1, Stack<Integer> stack2 ) {
    	while( !stack1.empty() ) {
    		stack2.push(stack1.pop());
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n5_stackQueue object = new n5_stackQueue();
		object.push(1);
		object.push(2);
		object.push(3);
		System.out.println(object.pop());
	}

}
