package 剑指Offer10_19;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * @author HanYehong
 *
 * @time 2018-9-4
 */

public class n19_printMatrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> al = new ArrayList<Integer>();
				int x = matrix[0].length;
				int y = matrix.length;
				if((x == 1) && (y==1)) {    //只有一个数
					ArrayList<Integer> single = new ArrayList<Integer>();
					single.add(matrix[0][0]);
					return single;
				}
				if((x == 0) && (y==0) ) {   //空
					ArrayList<Integer> single = new ArrayList<Integer>();
					return single;
				}
		       for( int i = 0; i < x; i++ ) {   //上
		    	   al.add(matrix[0][i]);
		       }
		       for( int i = 1; i < y; i++ ) {  //右
		    	   al.add(matrix[i][x-1]);
		       }
		       if((x-2 >= 0) && (y>1)) {   //下
		    	   for( int i = x-2; i >= 0; i--) {
			    	   al.add(matrix[y-1][i]);
			       }
		       }
		       if((y-2 >= 0) && (x>1)) {   //左
		    	   for( int i = y-2; i >0; i--) {
			    	   al.add(matrix[i][0]);
			       }
		       }
		      System.out.println(al.toString());
		      
		      if(y == 1 || y == 2) {     //只剩中间最后一圈，直接返回，不递归
		    	  return al;
		      }
		      
		      if(y-2>0 && x-2>0) {
		    	  int [][] matrix2 = new int[y-2][x-2];   //建立新一轮数组，上下左右分别少一个长度
			      for( int i = 1,k = 0; i < y-1; i++,k++) {
			    	  for( int j = 1,p = 0; j < x-1; j++,p++ ) {
			    		  matrix2[k][p] = matrix[i][j];
			    	  }
			      }
			      ArrayList<Integer> a = printMatrix(matrix2);  //递归
			      System.out.println(a.toString());
			      for( int i = 0; i < a.size(); i++ ) { 
			    	  al.add(a.get(i));
			      }
		      }
		      return al;
	    }
}
