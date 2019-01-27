/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月27日
 */

package 剑指offer1_9;

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
