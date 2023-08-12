import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T>{
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
    BinaryTree(T data){
        this.data=data;
        left = right=null;
    }
}
public class BinaryTreeOps{
    String msg = "root";
    BinaryTree<Integer> insert(){
        System.out.println("Enter the "+msg+" data");
        int data = new Scanner(System.in).nextInt();        //int data = new Scanner(System.in).nextInt();
        if(data == -1){
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<Integer>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        return node;
    }
    void print (BinaryTree<Integer> root){
        if(root==null){
            return;
        }
        String output = "";
        output+=root.data+"=>";
        if(root.left!=null){
            output+=" L :  "+root.left.data;
        }
        if(root.right!=null){
            output+=" R :  "+root.right.data;
        }
        System.out.println(output);
        print(root.left);
        print(root.right );
    }
    void Preorder(BinaryTree<Integer> root){
        //Root,left,Right
        if(root==null){
            return;
        }
        System.out.print(root.data+",");
        Preorder(root.left);
        Preorder(root.right);
    }
    void Inorder(BinaryTree<Integer> root){
        //left,Root,Right
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+",");
        Inorder(root.right);
    }
    void Postorder(BinaryTree<Integer> root){
        //left,Right,Root
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+",");
    }
    void Levelorder(BinaryTree<Integer> root){
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree<Integer> node = queue.removeFirst();
            System.out.print(node.data+",");
            if(node.left!=null){
                queue.addLast(node.left);
            }
            if(node.right!=null){
                queue.addLast(node.right);
            }
        }
    }
    void Preorderiterative(BinaryTree<Integer> root){
        //P,L,R
        if(root==null){
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> current = root;
        while(!st.isEmpty()|| current!=null){
            if(!st.isEmpty() && current==null){
                current = st.pop();
            }
            System.out.print(current.data+",");
            if(current.right!=null){
                st.push(current.right);
            }
            current=current.left;
        }
    }
    public static void main(String[] args) {
        BinaryTreeOps obj = new BinaryTreeOps();
        BinaryTree<Integer> root = obj.insert();
        obj.print(root);
        System.out.println();
        obj.Inorder(root);
        System.out.println();
        obj.Postorder(root);
        System.out.println();
        obj.Preorder(root);
        System.out.println();
        obj.Levelorder(root);
    }

}
/*Enter the root data
10
Enter the left data
20
Enter the left data
30
Enter the left data
40
Enter the left data
-1
Enter the right data
-1
Enter the right data
35
Enter the left data
-1
Enter the right data
-1
Enter the right data
25
Enter the left data
-1
Enter the right data
-1
Enter the right data
50
Enter the left data
52
Enter the left data
-1
Enter the right data
50
Enter the left data
-1
Enter the right data
-1
Enter the right data
-1
10=> L :  20 R :  50
20=> L :  30 R :  25
30=> L :  40 R :  35
40=>
35=>
25=>
50=> L :  52
52=> R :  50
50=>*/