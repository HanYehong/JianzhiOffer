/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * F(n)=F(n-1)+F(n-2)每一个数都等于前两项之和。
 * n<=39。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月28日
 */

package 剑指offer1_9;

public class n7_Fibonacci {
	
	public int Fibonacci(int n) {
		if ( n == 0 ) {
			return 0;
		}
		if ( n == 1 ) {
			return 1;
		}
		return Fibonacci(n-1) + Fibonacci(n-2);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( new n7_Fibonacci().Fibonacci(6) );

	}

}
