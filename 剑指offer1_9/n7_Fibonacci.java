/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
 * F(n)=F(n-1)+F(n-2)ÿһ����������ǰ����֮�͡�
 * n<=39��
 */

/**
 * @author HanYehong
 * 
 * 2018��6��28��
 */

package ��ָoffer1_9;

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
