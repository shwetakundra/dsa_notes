import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int value)
    {
        val = value;
        left = null;
        right = null;
    }

}
class BinaryTreeUtils{
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root); // 1st push root
        while(!queue.isEmpty()){   // while queue is not empty
            int size= queue.size();      // trick- int levelSize = queue.size();
            List<Integer> list =new ArrayList<>();
            for(int  i=0;i<size;i++) {
                TreeNode node = queue.poll(); // 2nd pop ele
                list.add(node.val);   // 3rd print its val
                if (node.left != null) {   // check left node not empty
                    queue.offer(node.left);  // push left node in queue
                }
                if (node.right != null) {
                    queue.offer(node.right);  // push right node in queue
                }
            }
            result.add(list);
        }
        return result;

    }
}
public class BinaryTreeLevelOrderTraversal_102 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left= new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        BinaryTreeUtils utils = new BinaryTreeUtils();
        List<List<Integer>> result = utils.levelOrder(root);
        System.out.println(result);


    }
}
