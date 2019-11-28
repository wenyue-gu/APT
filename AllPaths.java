import java.util.*;
import java.io.*;


public class AllPaths {
    ArrayList<String> temp = new ArrayList<String>();
    public String[] paths(TreeNode t) {
        // replace with working code
        int[]path = new int[1024];
        String[] ret = find(t, path, 0);
        Arrays.sort(ret);
        return ret;
    }


    public String[] find(TreeNode node, int path[], int pathLen)
    {
        if (node == null)
            return temp.toArray(new String[0]);

        path[pathLen] = node.info;
        pathLen++;

        if (node.left == null && node.right == null) {
            temp.add(sorts(path, pathLen));
        }
        else if (node.left != null && node.right == null) {
            find(node.left, path, pathLen);
        }
        else if (node.left == null && node.right != null) {
            find(node.right, path, pathLen);
        }
        else{
            find(node.left, path, pathLen);
            find(node.right, path, pathLen);
        }
        return temp.toArray(new String[0]);
    }

    /* Utility function that prints out an array on a line. */
    public String sorts(int ints[], int len)
    {
        String s = "";
        int i ;
        if(len>1) {
            for (i = 0; i < len-1; i++) {
                s = s + Integer.toString(ints[i]) + "->";
            }
            s = s + Integer.toString(ints[len-1]);
        }
        else {
            s = Integer.toString(ints[0]);
        }
        return s;
    }
}