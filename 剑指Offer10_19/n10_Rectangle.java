/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */

/**
 * @author HanYehong
 * 
 * 2018��7��7��
 */

package ��ָOffer10_19;

public class n10_Rectangle {
	public int RectCover(int target) {
        if( target <= 0 ){
            return 0;
        }
        if ( target == 1 ) {
			return 1;
		}
		if ( target == 2 ) {
			return 2;
		}
		return RectCover(target-1) + RectCover(target-2);
    }

}
