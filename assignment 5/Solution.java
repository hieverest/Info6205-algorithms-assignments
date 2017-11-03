public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int x) {
            val = x;
        }
    }

    int maxSum = Integer.MIN_VALUE;
    ArrayList<Integer> maxPathSumRes;

    public void maxPathSum(TreeNode root) {
        ArrayList<Integer> path = new ArrayList<>();
        maxPathSum(root, 0, path);
        for (Integer i : maxPathSumRes) {
            System.out.print(i + " -> ");
        }
        System.out.println();
    }

    private void maxPathSum(TreeNode node, int sum, ArrayList<Integer> path) {
        if (node == null) {
            return;
        }
        sum += node.val;
        path.add(node.val);
        ArrayList<Integer> left = new ArrayList<>(path);
        ArrayList<Integer> right = new ArrayList<>(path);
        if (node.left == null && node.right == null && sum > maxSum) {
            maxSum = sum;
            maxPathSumRes = new ArrayList<>(path);
        }
        maxPathSum(node.left, sum, left);
        maxPathSum(node.right, sum, right);
    }
}