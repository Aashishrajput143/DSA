public class PrintNodesDistanceKRoot {
    void printtKNodes(BinaryTree<Integer> root,int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.println(root.data+",");
        }
        else{
            printtKNodes(root.left, k-1);
            printtKNodes(root.right, k-1);
        }
    }
    public static void main(String[] args) {
         
    }
}
