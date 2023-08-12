public class MergeLinkedList{
    ListNode merge(ListNode start1,ListNode start2){
        if(start1==null){
            return start2;
        }
        if(start2==null){
            return start1;
        }
        if(start1.data < start2.data){
            start1.next=merge(start1.next, start2);
            return start1;
        }
        else{
            start2.next=merge(start1, start2.next);
            return start2;
        }
    }
    ListNode mergeteolists(ListNode list1,ListNode list2){

        return merge(list1, list2);
    }
    public static void main(String[] args) {

    }
}
