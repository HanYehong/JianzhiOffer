/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */

/**
 * @author HanYehong
 * 
 * 2018年7月7日
 */

package 剑指Offer10_19;

public class n12_Pow {
	
	public static double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(1.1,5));
	}

}
