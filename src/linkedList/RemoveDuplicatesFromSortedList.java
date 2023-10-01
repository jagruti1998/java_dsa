package linkedList;

public class RemoveDuplicatesFromSortedList {
public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Example input: Creating a sorted linked list with duplicates
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        ListNode list = solution.new ListNode(1);
        list.next = solution.new ListNode(1);
        list.next.next = solution.new ListNode(2);
        list.next.next.next = solution.new ListNode(2);
        list.next.next.next.next = solution.new ListNode(3);

        // Call the deleteDuplicates method to remove duplicates
        ListNode result = solution.deleteDuplicates(list);

        // Print the modified linked list without duplicates
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
