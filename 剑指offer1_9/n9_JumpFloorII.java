/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */

/**
 * @author HanYehong
 * 
 * 2018��6��30��
 */

package ��ָoffer1_9;

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
