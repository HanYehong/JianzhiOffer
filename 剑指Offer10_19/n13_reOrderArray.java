/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序。
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分。
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

/**
 * @author HanYehong
 * 
 * 2018年8月5日
 */

package 剑指Offer10_19;

public class n13_reOrderArray {
	
	public void reOrderArray(int [] array) {
        int len = array.length;
        int len_1 = 0; //奇s
        for( int i = 0; i < len; i++ ) {
        	if(array[i] %2 != 0) {
        		len_1++;
        	}
        }
        int []array2 = new int[len-len_1];//存偶数
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
