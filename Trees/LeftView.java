import java.util.LinkedList;

public class LeftView {
    static int maxlevel = 0;
    static void leftView(BinaryTree<Integer> root, int level){
        if(root==null){
            return;
        }
        if(maxlevel<level){
            System.out.print(root.data+",");
            maxlevel=level;
        }
        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }
    static void leftViewIter(BinaryTree<Integer> root){
        if( root==null){
            return;
        }
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTree<Integer> currentnode = queue.removeFirst();
                if(i==0){
                    System.out.print(currentnode.data+",");
                }
                if(currentnode.left != null){
                    queue.addLast(currentnode.left);
                }
                if(currentnode.right != null){
                    queue.addLast(currentnode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
