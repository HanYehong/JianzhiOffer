/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж�����������
 */

/**
 * @author HanYehong
 * 
 * 2018��6��28��
 */

/**
 * ���Կ���쳲�������������
 * ��ֻ��1��ʱ��ֻ��1����������һ�ף���
 * ����2��ʱ����2��������ÿ����һ�ף�����һ�������ף���
 * ����3��ʱ����3��������1+2��2+1��1+1+1����
 * ����4��ʱ����ʱ��Ӧ�ûᷢ�֣���������ܵ�һ��ֻ��һ��ʱ���ǻ�ʣ���ף���ʱ��������ֻ������ʱ��һ���ģ�����3�֣�
 * ������ܵ�һ�������ף��ǻ�ʣ�����ף���ʱ�������ֺ�ֻ������ʱ��һ���ģ���2�֡�
 * �ʣ�f(4)=f(3)+f(2)��
 * ��˵ó���f(n)=f(n-1)+f(n-2)����쳲��������С�
 */

package ��ָoffer1_9;

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