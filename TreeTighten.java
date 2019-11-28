public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        // replace with working code
        if(t==null) return null;
        if(t.left!=null && t.right!=null) {
            return new TreeNode(t.info,tighten(t.left),tighten(t.right));
        }
        else if(t.left==null && t.right!=null){
            t = t.right;
            return tighten(t);
        }
        else if(t.left!=null && t.right==null){
            t = t.left;
            return tighten(t);
        }
        else{
            return new TreeNode(t.info);
        }


    }
}