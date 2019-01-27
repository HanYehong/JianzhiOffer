import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class n24_FindPath {
    private ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(arrayList,0,root,target);
        //自定义Comparator对象，自定义排序
        Comparator c = new Comparator<ArrayList>() {
            public int compare(ArrayList arrayList1, ArrayList arrayList2) {
                // TODO Auto-generated method stub
                if(arrayList1.size() < arrayList2.size())
                    return 1;
                    //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
                    //		else return 0; //无效
                else return -1;
            }
        };
        Collections.sort(arrayLists,c);
        return arrayLists;
    }

    public void dfs(ArrayList<Integer> arrayList, int total, TreeNode treeNode, int target){
        if(treeNode != null){
            if(total+treeNode.val == target && treeNode.left==null && treeNode.right==null) {
                arrayList.add(treeNode.val);
                arrayLists.add(new ArrayList<>(arrayList));
                arrayList.remove(arrayList.size()-1);
                return ;
            }else if(total+treeNode.val > target){
                return ;
            }else if(treeNode.left==null && treeNode.right==null) {
                return ;
            }else{
                total += treeNode.val;
                arrayList.add(treeNode.val);
                dfs(arrayList,total,treeNode.left,target);
                dfs(arrayList,total,treeNode.right,target);
                arrayList.remove(arrayList.size()-1);
                total -= treeNode.val;
            }
        }
        return ;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(12);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(7);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node10 = new TreeNode(10);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

//        node2.left = node5;
//        node2.right = node6;
//
//        node3.left = node7;
//        node3.right = node8;
//
//        node4.left = node9;
//        node4.right = node10;

        n24_FindPath n24_findPath = new n24_FindPath();
        n24_findPath.FindPath(root,22);
        System.out.println(n24_findPath.arrayLists.toString());
    }
}
