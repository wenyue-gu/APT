public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        TreeNode tree = createTree(dictionary);
        String result = decodeTree(archive, tree);
        return result;

    }

    private String decodeTree(String archive, TreeNode tree) {
        String result = "";
        TreeNode node = tree;

        String[] codes = archive.split("");
        for (int i = 0; i < archive.length(); i++) {
            if ((codes[i].equals("0") && node.left == null)
                    || (codes[i].equals("1") && node.right == null)) {
                result += node.info;
                i --;
                node = tree;
                continue;
            }

            if (codes[i].equals("0")) node = node.left;
            else if (codes[i].equals("1")) node = node.right;
            else throw new Error();
        }

        result += node.info;
        return result;
    }

    private TreeNode createTree(String[] dictionary) {
        TreeNode first = new TreeNode("");
        TreeNode tree = first;
        char content = 'A';


        for (int i = 0; i < dictionary.length; i++) {
            String[] d = dictionary[i].split("");

            for (int j = 0; j < d.length; j++) {

                if (d[j].equals("0")){
                    if (tree.left == null) tree.left = new TreeNode("");
                    tree = tree.left;
                }
                else {
                    if (tree.right == null) tree.right = new TreeNode("");
                    tree = tree.right;
                }
            }
            tree.info = Character.toString(content);
            content += 1;
            tree = first;
        }

        return first;
    }



    public class TreeNode {
        String info;
        TreeNode left;
        TreeNode right;
        TreeNode(String x){
            info = x;
        }
        TreeNode(String x, TreeNode lNode, TreeNode rNode){
            info = x;
            left = lNode;
            right = rNode;
        }
    }

    public static void main(String[] args) {
        String archive = "101101";
        String[] dic = {"00","10","01","11"};
        HuffmanDecoding huffmanDecoding = new HuffmanDecoding();

        System.out.println(huffmanDecoding.decode(archive, dic));

    }

}