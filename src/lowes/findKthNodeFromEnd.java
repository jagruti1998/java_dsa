package lowes;

public class findKthNodeFromEnd {
    public static ListNode findKthElement(ListNode head, int n){
        ListNode slow=head, fast=head;

        if(head==null){
            return null;
        }

        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // find the 3rd node from the end
        ListNode find=findKthElement(head, n);
        if (find != null) {
            System.out.println("The " + n + "th node from the end is: " + find.data);
        } else {
            System.out.println("The list is too short or n is not valid.");
        }
    }
}
