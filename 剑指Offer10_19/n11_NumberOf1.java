/**
 * 输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 */

/**
 * @author HanYehong
 * 
 * 2018年7月7日
 */

package 剑指Offer10_19;

public class n11_NumberOf1 {
	
	public static int NumberOf1(int n) {
		int sum = 0;
		String binary = Integer.toBinaryString(n);
		for ( int i = 0; i < binary.length(); i++ ) {
			if ( binary.charAt(i) == '1' ) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(0));
	}

}
