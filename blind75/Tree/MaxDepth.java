package blind75.Tree;

class Solution {

    int depth = 0;
    int descDepth = 0;

    //Alittle broken, only if multithreading cuz using same varaibles
    public int MYmaxDepth(TreeNode root) {

        if(root != null){
            descDepth++;

            System.out.println("Entereed first if, descDepth: " + descDepth);

            if(root.left != null){
                System.out.println("left, root.left: " + root.left.val);
                MYmaxDepth(root.left);
            }
            if(root.right != null){
                System.out.println("right, root.right: " + root.right.val);
                MYmaxDepth(root.right);
            }

            System.out.println("------ out of ifs " + descDepth);
            if(depth < descDepth) depth = descDepth;
            descDepth--;
        }
        return depth;
    }

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if(lDepth > rDepth) return lDepth+1;
            else return rDepth+1;
        }
    }


}