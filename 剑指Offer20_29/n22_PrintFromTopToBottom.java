import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class n22_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root == null) return arrayList;
        Queue<TreeNode> queue = new ArrayBlockingQueue(100);
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.remove();
            arrayList.add(treeNode.val);
            if(treeNode.left!=null) queue.add(treeNode.left);
            if(treeNode.right!=null) queue.add(treeNode.right);
        }
        return arrayList;
    }

    public static void main(String args[]){

}
}
