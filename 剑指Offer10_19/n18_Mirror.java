package ��ָOffer10_19;

/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * 
 * @author HanYehong
 *
 *@Time 2018-9-4
 */
public class n18_Mirror {
	public void Mirror(TreeNode root) {
        TreeNode temp;
        if(root!=null)
        {
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
        }
    }

}
