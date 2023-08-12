class BST{
    int data;
    BST left;
    BST right;
    BST(int data){
        this.data=data;
    }
}
public class BSTOperations {
    BST root; //by default root is null
    void insert(int data){
        root = insert(root,data);
    }
    BST insert(BST root ,int data){
        // check if tree is null
        if(this.root == null){
            this.root = new BST(data);
            return root;
        }
        if(data<root.data){
            root.left= insert(root.left, data);
        }
        else if(data>root.data){
            root.right= insert(root.right, data);
        }
        return root;
    }
    // Search in a tree
    BST Search(BST root, int data){
        // Base Case
        if(root==null || root.data==data){
            return root;
        }
        if(root.data>data){
            return Search(root.left, data);
        }
        return Search(root.right, data);
    }
    // Min element in BST- Always present in left
    int minElement (BST root){
        int minv = root.data;
        while(root.left!=null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Max element in BST- Always present in right
    int maxElement (BST root){
        int maxv = root.data;
        while(root.right!=null){
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;
    }

    void print(){
        inorder(root);
    }
    void inorder(BST root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        
    }
}
