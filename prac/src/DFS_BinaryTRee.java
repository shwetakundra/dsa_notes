class TreeeNode{
    int val;
    TreeeNode left;
    TreeeNode right;
    TreeeNode(int value){
        val=value;
        left=null;
        right=null;
    }
}

class buildTRee{
    public static int indx=-1;
    public TreeeNode buildbinaryTree(int [] arr){
     indx++;
     if(arr[indx]==-1){
         return null;
     }
     TreeeNode root=new TreeeNode(arr[indx]);
     root.left=buildbinaryTree(arr);
     root.right=buildbinaryTree(arr);
     return root;

    }
    public void preorderTraversal(TreeeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }
    public void inorderTraversal(TreeeNode root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);

    }

    public void postorderTraversal(TreeeNode root){
        if(root==null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");

    }
}

public class DFS_BinaryTRee {
    public static void main(String[] args) {
        int [] arr={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        buildTRee node=new buildTRee();
        TreeeNode root=node.buildbinaryTree(arr);

        //print tree data preorder Traversal;
        node.preorderTraversal(root);
        System.out.println();

        //print tree data inorder Traversal;
        node.inorderTraversal(root);
        System.out.println();

        //print tree data postorder Traversal;
        node.postorderTraversal(root);


    }
}
