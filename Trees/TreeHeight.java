public class TreeHeight {
    int height(BinaryTree<Integer> root){
        if(root==null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1+Math.max(leftheight, rightheight);
    }
    public static void main(String[] args) {
        
    }
}
