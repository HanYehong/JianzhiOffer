/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */

/**
 * @author HanYehong
 * 
 * 2018��6��27��
 */

package ��ָoffer1_9;

public class n2_stringReplace {
	
	public String replaceSpace(StringBuffer str) {
		if ( str == null ) {
			return "";
		}
	    int len = str.length();
	    int begin_index = str.indexOf(" ");
	    while( begin_index != -1 ) {
	    	str.replace(begin_index, begin_index+1, "%20");
	    	begin_index = str.indexOf(" ", begin_index);
	    }
	    String s = new String(str);
	    return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("");
		System.out.println( new n2_stringReplace().replaceSpace(str));
	}

}
