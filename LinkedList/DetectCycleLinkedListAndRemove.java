public class DetectCycleLinkedListAndRemove{
    ListNode detectcycle(ListNode head) {
        ListNode slow;
        ListNode fast;
        boolean iscycle = false;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                iscycle = true;
                break;
            }
        }
        if (iscycle) {
            fast = head;
            while (slow != fast) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
