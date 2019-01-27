package 剑指Offer20_29;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 
 * @author HanYehong
 * 
 * @time 2018-9-8
 */
import java.util.Stack;

public class n20_StackMin {
	private int min = 0;
	private Stack<Integer> st = new Stack<Integer>();
    private Stack<Integer> st_min = new Stack<Integer>();
	
	public void push(int node) {
        if( st.isEmpty() == true ) {
			min = node;
            st_min.push(min);
		}
        st.push(node);
        if( node <= this.min ) {
        	min = node;
            st_min.push(min);
        }
    }
    
    public void pop() {
        if( st.pop() == st_min.peek() ){
            st_min.pop();
            min = st_min.peek();
        }
    }
    
    public int top() {
        return (int) st.peek();
    }
    
    public int min() {
        return st_min.peek();
    }

}
