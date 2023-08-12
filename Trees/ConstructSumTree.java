public class ConstructSumTree{
    public int sumtree(BinaryTree<Integer> root){
        if(root == null){
            return 0;
        }
        // traverse to the left most child of tree
        int left = sumtree(root.left);
        int right = sumtree(root.right);
        int currentval = root.data;
        root.data = left + right;
        return left + right + currentval;
    }
    public static void main(String[] args) {
        
    }
}