import java.util.*;

public class TopView {
    public static void printTopView(TreeNode root) {
        if (root == null) {
            System.out.println("Root is null!");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Queue<QTerm> q = new LinkedList<>();
        q.add(new QTerm(root, 0));
        while(!q.isEmpty()) {
            QTerm qt = q.poll();
            int distance = qt.distance;
            TreeNode node = qt.node;
            if (!map.containsKey(distance)) {
                map.put(distance, node.val);
                System.out.print(node.val + ", ");
            }
            if (node.left != null) {
                q.add(new QTerm(node.left, distance - 1));
            }
            if (node.right != null) {
                q.add(new QTerm(node.right, distance + 1));
            }
        }
        System.out.println();
    }
}

class QTerm {
    TreeNode node;
    int distance;

    public QTerm(TreeNode node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}