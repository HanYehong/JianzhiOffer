package ��ָOffer10_19;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֡�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
				if((x == 1) && (y==1)) {    //ֻ��һ����
					ArrayList<Integer> single = new ArrayList<Integer>();
					single.add(matrix[0][0]);
					return single;
				}
				if((x == 0) && (y==0) ) {   //��
					ArrayList<Integer> single = new ArrayList<Integer>();
					return single;
				}
		       for( int i = 0; i < x; i++ ) {   //��
		    	   al.add(matrix[0][i]);
		       }
		       for( int i = 1; i < y; i++ ) {  //��
		    	   al.add(matrix[i][x-1]);
		       }
		       if((x-2 >= 0) && (y>1)) {   //��
		    	   for( int i = x-2; i >= 0; i--) {
			    	   al.add(matrix[y-1][i]);
			       }
		       }
		       if((y-2 >= 0) && (x>1)) {   //��
		    	   for( int i = y-2; i >0; i--) {
			    	   al.add(matrix[i][0]);
			       }
		       }
		      System.out.println(al.toString());
		      
		      if(y == 1 || y == 2) {     //ֻʣ�м����һȦ��ֱ�ӷ��أ����ݹ�
		    	  return al;
		      }
		      
		      if(y-2>0 && x-2>0) {
		    	  int [][] matrix2 = new int[y-2][x-2];   //������һ�����飬�������ҷֱ���һ������
			      for( int i = 1,k = 0; i < y-1; i++,k++) {
			    	  for( int j = 1,p = 0; j < x-1; j++,p++ ) {
			    		  matrix2[k][p] = matrix[i][j];
			    	  }
			      }
			      ArrayList<Integer> a = printMatrix(matrix2);  //�ݹ�
			      System.out.println(a.toString());
			      for( int i = 0; i < a.size(); i++ ) { 
			    	  al.add(a.get(i));
			      }
		      }
		      return al;
	    }
}
