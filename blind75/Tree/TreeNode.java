package blind75.Tree;

// Def of TreeNode
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void tellData(){
        System.out.println(
                "Value: " + this.val + ", left: " + this.left + ", rightL " + this.right
        );
    }
}
