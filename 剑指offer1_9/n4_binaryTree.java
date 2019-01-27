/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

/**
 * @author HanYehong
 * 
 * 2018年6月27日
 */

package 剑指offer1_9;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

public class n4_binaryTree {
	private int [] pre;
	private int pre_index = 0;
	
	public TreeNode LeftNodeAndRightNode( int x, int y, int shuzu[] ) {
		int index = Find ( pre[ this.pre_index++ ], x, y, shuzu );
		TreeNode temp = new TreeNode( shuzu[index] );
		if ( index != x ) {
			temp.left = LeftNodeAndRightNode( x, index-1, shuzu );
		}
		if( index != y ) {
			temp.right = LeftNodeAndRightNode( index+1, y, shuzu );
		}
		return temp;
	}
	
	public int Find( int target, int x, int y, int shuzu[] ) {
		int i;
        for ( i = x; i <= y; i++ ) {
        	if ( shuzu[i] == target ) {
        		break;
        	}
        }
        return i;
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode tn = new TreeNode( pre[0] );
		this.pre = pre;
		int in_len = in.length;
        int rootNode_index = Find( pre[ pre_index++ ],0, in_len, in );
        if ( rootNode_index != 0 ) {
        	tn.left = LeftNodeAndRightNode( 0, rootNode_index-1, in );
        }
        if ( rootNode_index != in_len-1 ) {
        	tn.right = LeftNodeAndRightNode( rootNode_index+1, in_len-1, in );
        }
        return tn;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre[] = {1,2,3,4};
		int in[] = {4,3,2,1};
		TreeNode tn =new n4_binaryTree().reConstructBinaryTree(pre,in);
		System.out.println(tn.left.left.val);
	}

}
