/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֡�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */

/**
 * @author HanYehong
 * 
 * 2018��8��5��
 */

package ��ָOffer10_19;

public class n13_reOrderArray {
	
	public void reOrderArray(int [] array) {
        int len = array.length;
        int len_1 = 0; //��s
        for( int i = 0; i < len; i++ ) {
        	if(array[i] %2 != 0) {
        		len_1++;
        	}
        }
        int []array2 = new int[len-len_1];//��ż��
        int count = 0;
        int count2 = 0;
        for( int i = 0; i < len; i++ ) {
        	if(array[i] %2 != 0) {
        		array[count++] = array[i];
        	}else {
        		array2[count2++] = array[i];
        	}
        }
        for( int i = 0; i < len-len_1; i++) {
        	array[count++] = array2[i];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,4,9,1,6,5,2,3,8,7,1,9,6};
		new n13_reOrderArray().reOrderArray(array);
        for( int i = 0; i < array.length; i++ ) {
        	System.out.print(array[i]+" ");
        }
	}

}
