import java.util.ArrayList;

public class LCA {
    boolean findpath(BinaryTree<Integer> root,ArrayList<BinaryTree<Integer>> path, int n){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        if(findpath(root.left, path, n)|| findpath(root.right, path, n)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2){
        ArrayList<BinaryTree<Integer>> path1 = new ArrayList<>();
        ArrayList<BinaryTree<Integer>> path2 = new ArrayList<>();
        if(findpath(root,path1,n1)==false || findpath(root,path2,n2)==false){
            return null;
        }
        for (int i = 0; i < path1.size()-1 && i< path2.size()-1; i++) {
            if(path1.get(i+1)!=path2.get(i+1)){
                return path1.get(i);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
