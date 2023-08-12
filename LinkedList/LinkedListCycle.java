public class LinkedListCycle {
    private ListNode start;
    private ListNode tail;

    void add(int data){
        if(start==null){
            tail=start=new ListNode(data);
            return;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail=node;
    }
    public boolean hascycle(){
        if(start==null || start.next==null ){
            return false;
        }
        ListNode slow;
        ListNode fast;
        slow=fast=start;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        // Circular Linked List
        obj.tail.next=obj.start;
        System.out.println(obj.hascycle());
    }
}
