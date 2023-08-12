public class LCA_Optimized {
    static BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if(root.data==n1|| root.data==n2){
            return root;
        }
        BinaryTree<Integer> lc1 = lca(root.left,n1,n2);
        BinaryTree<Integer> lc2 = lca(root.right,n1,n2);
        if(lc1!=null && lc2!=null){
            return root;
        }
        if(lc1!=null){
            return lc1;
        }
        if(lc2!=null){
            return lc2;
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
