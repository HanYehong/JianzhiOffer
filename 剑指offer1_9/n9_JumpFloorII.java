/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月30日
 */

package 剑指offer1_9;

public class n9_JumpFloorII {
	
	public int JumpFloorII(int target) {
		if ( target == 1 ) {
			return 1;
		}
		int sum = 0;
		for ( int i = 1; i < target; i++ ) {
			sum += JumpFloorII(i);
		}
	    return sum + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n9_JumpFloorII obj = new n9_JumpFloorII();
		System.out.println(obj.JumpFloorII(4));

	}

}
