public class DeleteDuplicates{
    ListNode deleteduplicate(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                //ListNode remove = temp.next;
                //temp.next = remove.next;
                temp.next = temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}
