/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月27日
 */

package 剑指offer1_9;

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
