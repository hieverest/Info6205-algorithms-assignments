public class MirrorOfSubtree {
    boolean areMirror(Node a, Node b) {
        /* Base case : Both empty */
        if (a == null && b == null)
            return true;
 
        // If only one is empty
        if (a == null || b == null) 
            return false;
 
        /* Both non-empty, compare them recursively
           Note that in recursive calls, we pass left
           of one tree and right of other tree */
        return a.data == b.data
                && areMirror(a.left, b.right)
                && areMirror(a.right, b.left);
    }

    boolean checkMirrorInATree(TreeNode root, TreeNode subtree) {

        if (areMirror(root, subtree)) return true;
        return checkMirrorInATree(root.left, subtree) || checkMirrorInATree(root.right, subtree);


    }
}