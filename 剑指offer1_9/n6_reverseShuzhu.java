/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */

/**
 * @author HanYehong
 * 
 * 2018��6��28��
 */

package ��ָoffer1_9;

public class n6_reverseShuzhu {
	
	public int minNumberInRotateArray(int [] array) {
		
		int len = array.length;
		if ( len == 0 ) {
			return 0;
		}
		
		int left = 0;
		int right = len - 1;
		int mid = ( left + right ) / 2;
		
		if ( array[left] < array[right] ) {
			return array[0];
		}
		
		if ( array[left] == array[right] && array[left] == array[mid] ) {
			return Find(array, len);
		}
		
		while ( right - left > 1 ) {
			if ( array[mid] > array[left] ) {
				left = mid;
			}
			if ( array[mid] < array[right] ) {
				right = mid;
			}
			mid = ( left + right ) / 2;
		}
		
		return array[right];
		
//		int len = array.length;
//		if ( len == 0 ) {
//			return 0;
//		}
//		
//		int min = array[0];
//		
//		for ( int i = 1; i < len; i++ ) {
//			if ( array[i] < min ) {
//				min = array[i];
//			}
//		}
//		
//		return min;
//		
	}
	
	public int Find( int array[], int len ) {
		int min = array[0];
		for ( int i = 1; i < len; i++ ) {
			if ( array[i] < min ) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,8,9,10,11,12,1,3,4,5,6}; 
		System.out.println( new n6_reverseShuzhu().minNumberInRotateArray(arr));

	}

}
