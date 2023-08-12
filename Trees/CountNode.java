public class CountNode {
    int countnode(BinaryTree<Integer> root){
        if(root==null){
            return 0;
        }
        int counter = 1;
        counter += countnode(root.left);
        counter += countnode(root.right);
        return counter;
    }
    public static void main(String[] args) {
        
    }
}
