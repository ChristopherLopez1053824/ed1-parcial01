package ed.lab;

import java.util.LinkedList;

public class E01FlattenBT {
    LinkedList<TreeNode<Integer>> Result = new LinkedList<>();
    public void flatten(TreeNode<Integer> root) {
        PreOrder(root);
        root = CrearArbol(Result);
    }

    public TreeNode CrearArbol(LinkedList<TreeNode<Integer>> Result) {
        if(Result.isEmpty()) return null;
        TreeNode<Integer> root = Result.removeFirst();
        root.left = null;
        root.right = CrearArbol(Result);
        return root;
    }

    public void PreOrder(TreeNode<Integer> root) {
        if(root == null) return;
        Result.add(root);
        PreOrder(root.left);
        PreOrder(root.right);
    }

}
