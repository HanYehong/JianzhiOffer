/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */

/**
 * @author HanYehong
 * 
 * 2018��6��27��
 */

package ��ָoffer1_9;

public class n1_shuzu {
	
	 public boolean Find(int target, int [][] array) {
		 if ( array == null ) {
			 return false;
		 }
		
		 int row = 0;
		 int col = array[0].length - 1;
		 int array_len = array.length;
		 while( row < array_len && col >= 0 ) {
			 if ( target > array[ row ][ col] ) {
				 row++;
			 }else if ( target < array[ row ][ col ] ) {
				 col--;
			 }else {
				 return true;
			 }
		 }
		 return false;
		
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shuzu[][] = {
				{}
		};
		int number = 1;
		System.out.println( new n1_shuzu().Find(number,shuzu) );

	}

}
