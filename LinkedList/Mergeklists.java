import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mergeklists{
    public ListNode merge(ListNode[] lists){
        if(lists.length==0){
            return null;
        }
        List<Integer> newlist = new ArrayList<>();
        for(ListNode arr:lists){
            while(arr!=null){
                newlist.add(arr.data);
                arr=arr.next;
            }
        }
        Collections.sort(newlist);
        ListNode ans = null;
        ListNode temp = null;
        for (Integer i : newlist) {
            if(temp==null){
                temp = new ListNode(i);
                ans = temp;
            }
            else{
                temp.next= new ListNode(i);
                temp = temp.next;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
