public class Intersectionoftwolinkedlist{
    ListNode intersection(ListNode headA,ListNode headB){
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            if(a==null){
                a=headB;
            }
            else a=a.next;
            if(b==null){
                b=headA;
            }
            else b= b.next;
        }
        return a;

    }
    public static void main(String[] args) {
        
    }
}
