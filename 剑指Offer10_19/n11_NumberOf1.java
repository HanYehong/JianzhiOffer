/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ�����
 * ���и����ò����ʾ��
 */

/**
 * @author HanYehong
 * 
 * 2018��7��7��
 */

package ��ָOffer10_19;

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
