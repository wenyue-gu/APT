public class LeafSum {
    public int sum(TreeNode t) {
        if(t!=null) {
            if (t.left != null && t.right != null) return sum(t.left) + sum(t.right);
            else if (t.left != null && t.right == null) return sum(t.left);
            else if (t.left == null && t.right != null) return sum(t.right);
            else return t.info;
        }
        else{
            return 0;
        }

    }
}