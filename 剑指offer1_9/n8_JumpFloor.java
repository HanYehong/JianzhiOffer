/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月28日
 */

/**
 * 可以看作斐波那契数列来求：
 * 当只有1阶时，只有1种跳法（跳一阶）；
 * 当有2阶时，有2种跳法（每次跳一阶，或者一次跳两阶）；
 * 当有3阶时，有3种跳法（1+2，2+1，1+1+1）；
 * 当有4阶时，这时候应该会发现，如果当青蛙第一次只跳一阶时，那还剩三阶，此时的跳法与只有三阶时是一样的，则有3种，
 * 如果青蛙第一次跳两阶，那还剩下两阶，此时的跳法又和只有两阶时是一样的，有2种。
 * 故，f(4)=f(3)+f(2)；
 * 因此得出，f(n)=f(n-1)+f(n-2)，即斐波那契数列。
 */

package 剑指offer1_9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class n8_JumpFloor {
	
	public int JumpFloor(int target) {
		if ( target == 1 ) {
			return 1;
		}
		if ( target == 2 ) {
			return 2;
		}
		return JumpFloor(target-1) + JumpFloor(target-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n8_JumpFloor obj = new n8_JumpFloor();
		System.out.println(obj.JumpFloor(6));
	}
}