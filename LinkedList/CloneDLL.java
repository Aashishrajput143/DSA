import java.util.HashMap;

class NodeDLL{
    int data;
    NodeDLL next,random;
    NodeDLL(int data){
        this.data = data;
        next=random=null;
    }
}
public class CloneDLL {
    static NodeDLL clone(NodeDLL head){
        HashMap<NodeDLL,NodeDLL> map = new HashMap<>();
        for(NodeDLL current = head;current!=null;current=current.next){
            map.put(current, new NodeDLL(current.data));
        }
        for(NodeDLL current = head; current!=null;current=current.next){
            NodeDLL clonecurrent = map.get(current);
            clonecurrent.next = map.get(current.next);
            clonecurrent.random = map.get(current.random);
        }
        NodeDLL head2 = map.get(head);
        return head2;
    }
    static NodeDLL Approach2(NodeDLL head){
        NodeDLL next;
        for(NodeDLL current = head;current!=null;current=current.next){
            next =current.next;
            current.next=new NodeDLL(current.data);
            current.next.next=next;
        }
        for(NodeDLL current = head;current!=null;current=current.next.next){
            current.next.random=current.random!=null?current.random.next:null;
        }
        NodeDLL old_Pointer = head;
        NodeDLL new_Pointer = head.next;
        NodeDLL old_head = head.next;
        while(old_Pointer!=null){
            old_Pointer.next=old_Pointer.next.next;
            new_Pointer.next=new_Pointer.next!=null?new_Pointer.next.next:null;
            old_Pointer=old_Pointer.next;
            new_Pointer=new_Pointer.next;
        }
        return old_head;
    }
    public static void main(String[] args) {
        
    }
}
