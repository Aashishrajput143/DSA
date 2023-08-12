class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}
public class SplitLinkedList {
    ListNode start;
    ListNode tail;
    void splitCircular(){
        ListNode fast =start;
        ListNode slow = start;
        while(fast.next!=start && fast.next.next != start){
            fast=fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next==start){
            fast=fast.next;
        }
        ListNode start1 = start;
        ListNode start2 = null;
        if(start.next!= start){
            start2=slow.next;
        }
        fast.next=slow.next;
        slow.next=start;
        print(start1);
        System.out.println();
        print(start2);
    }
    void print(ListNode start) {
        ListNode temp = start;
        while (temp.next != start) {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.print(temp.data+", ");
    }
    void add(int data){
        if(start==null){
            tail=start=new ListNode(data);
            return;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail=node;
    }
    public static void main(String[] args) {
        // Circular Linked List
        SplitLinkedList obj = new SplitLinkedList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        //obj.add(60);

        // Circular Linked List
        obj.tail.next=obj.start;
        obj.splitCircular();
    }
}
