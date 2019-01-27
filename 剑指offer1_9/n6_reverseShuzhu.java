/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月28日
 */

package 剑指offer1_9;

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
