public class Palindrome<T> {
    private NodeA<T> start;
    void insertAtLast(NodeA<T> node) {
        if (start == null) {
            start = node;
            return;
        }
        NodeA<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    boolean isPalindrome(){
        NodeA<T> slow;
        NodeA<T> fast;
        NodeA<T> prev;
        NodeA<T> start1;
        slow = fast= prev = start1 =start;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next=null;
        NodeA<T> current = slow;
        NodeA<T> prev1 = null;
        while(current!=null){
           NodeA<T> next1 = current.next;
            current.next=prev1;
            prev1=current;
            current=next1;
        }
        slow=prev1;
        while(start1!=null && slow!=null){
            if(start1.data!=slow.data){
                return false;
            }
            start1 = start1.next;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome<Integer> obj = new Palindrome<>();
        obj.insertAtLast(new NodeA<>(1));
        obj.insertAtLast(new NodeA<>(2));
        obj.insertAtLast(new NodeA<>(2));
        obj.insertAtLast(new NodeA<>(1));
        System.out.println(obj.isPalindrome());

    }
}
