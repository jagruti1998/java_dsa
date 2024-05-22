package lowes;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 3; // Remove the 3rd node from the end
        ListNode nthNodeFromEnd = RemoveNthNodeFromEnd(head, n);
        printList(head);


    }

    public static ListNode RemoveNthNodeFromEnd(ListNode head,int n){
        ListNode slow=head, fast=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;//return null
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }

    //print list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}
