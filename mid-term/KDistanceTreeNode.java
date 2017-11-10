class KDistanceTreeNode {
    TreeNode root;

    void levelK(TreeNode root, int k) {
        levelK(root, 1, k);
    }

    private void levelK(TreeNode node, int level, int k) {
        if (node == null) {
            return;
        }
        if (level == k) {
            System.out.print(node.val + ", ");
            return;
        }
        levelK(node.left, level + 1, k);
        levelK(node.right, level + 1, k);
    }

    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}