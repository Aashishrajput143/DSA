public class LinkedListCRUD<T> {
    private NodeA<T> start;

    int getcount() {
        NodeA<T> temp = start;
        int counter = 0;
        while (temp.next != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    void insertAtBeg(NodeA<T> node) {
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtLast(NodeA<T> node) {
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        // if linked list has only 1 node
        // if(start.next==null){
        // start.next=node;
        // return;
        // }
        NodeA<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtMid(NodeA<T> node, int pos) {
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        if (pos == 0) {
            insertAtBeg(node);
            return;
        }
        if (pos > getcount()) {
            // throw new RuntimeException("Postion is Invalid");
            insertAtLast(node);
            return;
        }
        if (pos >= 1) {
            int i = 1;
            NodeA<T> temp = start;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteAtBeg() {
        // if linked list is empty
        if (start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        start = start.next;
    }

    void deleteAtLast() {
        // if linked list is empty
        if (start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        NodeA<T> temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteAtMid(int pos) {
        // if linked list is empty
        if (start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        if (pos == 0) {
            deleteAtBeg();
            return;
        }
        if (pos > getcount()) {
            throw new RuntimeException("Postion is Invalid");
        }
        if (pos >= 1) {
            int i = 1;
            NodeA<T> temp = start;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        // NodeA<T> temp = null;
        // if (pos == 0) {
        // temp = start.next;
        // start = temp;
        // return;
        // }
        // int i = 1;
        // temp = start;
        // while (i < pos) {
        // temp = temp.next;
        // i++;
        // }
        // temp.next = temp.next.next;
    }

    void print() {
        NodeA<T> temp = start;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    void printMid1() {
        int mid = getcount() / 2;
        int i = 1;
        NodeA<T> temp = start;
        while (i < mid) {
            temp = temp.next;
            i++;
        }
        temp = temp.next;
        System.out.println(temp.data);
    }

    // fast slow pointer Approach
    void printMid() {
        NodeA<T> slow;
        NodeA<T> fast;
        slow=fast=start;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    void finkthNode(int k){//from the last
        int n= getcount();
        int x= n-k+1;
        NodeA<T> temp=start;
        int i=1;
        while (i <= x) {
            temp = temp.next;
            i++;
        }
        //for (int i = 1; i <= x; i++) {
        //    temp=temp.next;
        //}
        System.out.println("Kth Node :"+temp.data);
    }
    void finkthnodeApproach2(int k){
        NodeA<T> p;
        NodeA<T> q;
        p=q=start;
        //move p pointer to the kth position from the left
        for (int i = 1; i <= k; i++) {
            p=p.next;
        }
        //now move both p and q pointer
        // when p will reach to the end of list, q will at the kth node from end
        while(p!=null){
            p=p.next;
            q=q.next;
        }
        System.out.println("kth Node : "+q.data);
    }
    void reverseLinkedList(){
        if(start==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(start.next==null){
            System.out.println("List Contains only one node..");
            return;
        }
        NodeA<T> current = start;
        NodeA<T> prev = null;
        while(current!=null){
            NodeA<T> next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        start=prev;
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();
        obj.insertAtBeg(new NodeA<>(2));
        obj.insertAtBeg(new NodeA<>(4));
        obj.insertAtBeg(new NodeA<>(6));
        obj.insertAtBeg(new NodeA<>(8));
        obj.insertAtBeg(new NodeA<>(10));
        obj.print();
        System.out.println("============");
        obj.insertAtLast(new NodeA<>(4));
        obj.insertAtLast(new NodeA<>(6));
        obj.insertAtLast(new NodeA<>(8));
        obj.insertAtLast(new NodeA<>(10));
        obj.insertAtLast(new NodeA<>(50));
        obj.print();
        System.out.println("============");
        obj.insertAtMid(new NodeA<>(100), 2);
        obj.insertAtMid(new NodeA<>(101), 0);
        obj.print();
        System.out.println("============");
        obj.deleteAtBeg();
        obj.print();
        System.out.println("============");
        obj.deleteAtLast();
        obj.print();
        System.out.println("============");
        obj.deleteAtMid(2);
        obj.print();
        System.out.println("============");
        obj.printMid();
        System.out.println("============");
        obj.printMid1();
        System.out.println("============");
        obj.finkthNode(3);
        obj.finkthnodeApproach2(3);
        System.out.println("After Reverse");
        obj.reverseLinkedList();
        obj.print();
    }
}
