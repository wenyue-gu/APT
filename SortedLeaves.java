import java.util.*;
import java.io.*;


public class SortedLeaves {
    ArrayList<String> ret = new ArrayList<String>();
    public String[] values(TreeNode tree) {
        // replace with working code
        doWork(tree);
        String[] r = ret.toArray(new String[0]);
        Arrays.sort(r);
        return r;
    }

    public void doWork(TreeNode tree){
        if(tree==null) return;
        if(tree.left == null && tree.right == null){
            char k = (char)tree.info;
            ret.add(Character.toString(k));
        }
        else if(tree.left!=null && tree.right == null){
            doWork(tree.left);
        }
        else if(tree.left==null && tree.right != null){
            doWork(tree.right);
        }
        else{
            doWork(tree.left);
            doWork(tree.right);
        }
    }
}