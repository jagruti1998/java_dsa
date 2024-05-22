package lowes;

public class SearchInSinglyLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int x = 2;

        SearchInSinglyLL searchInstance = new SearchInSinglyLL();
        boolean found = searchInstance.search(head, x);
        System.out.println("Element " + x + " found: " + found);
    }

    // Search for an element in the linked list
    public boolean search(ListNode head, int x) {
        ListNode current = head;

        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
