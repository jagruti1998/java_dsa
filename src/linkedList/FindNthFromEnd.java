package linkedList;

public class FindNthFromEnd {

    public static ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null;
        }

        ListNode firstPointer = head;
        ListNode secondPointer = head;

        // Move the first pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (firstPointer == null) {
                return null; // n is greater than the length of the list
            }
            firstPointer = firstPointer.next;
        }

        // Move both pointers simultaneously until the first pointer reaches the end
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return secondPointer;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 3; // Find the 3rd node from the end
        ListNode nthNodeFromEnd = findNthFromEnd(head, n);

        if (nthNodeFromEnd != null) {
            System.out.println("The " + n + "th node from the end is: " + nthNodeFromEnd.val);
        } else {
            System.out.println("The list is too short or n is not valid.");
        }
    }
}
