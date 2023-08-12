class NodeA<T>{
    T data;
    NodeA<T> next;
    public NodeA(T data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListGenType {
    public static void  main(String[] args) {
        NodeA<Integer> n1 = new NodeA<>(10);
        n1.next= new NodeA<>(20);
        n1.next.next = new NodeA<>(30);
        n1.next.next.next=new NodeA<>(40);
        n1.next.next.next.next=new NodeA<>(50);

        NodeA<Integer> start=n1;
        while(start!=null){
            System.out.print(start.data+",");
            start=start.next;
        }
    }
}
