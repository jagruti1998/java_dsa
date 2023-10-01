package linkedList;

public class MergeTwoSortedLists {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        // Example inputs
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Creating two sorted linked lists
        ListNode list1 = solution.new ListNode(1);
        list1.next = solution.new ListNode(3);
        list1.next.next = solution.new ListNode(5);

        ListNode list2 = solution.new ListNode(2);
        list2.next = solution.new ListNode(4);
        list2.next.next = solution.new ListNode(6);

        // Merge the two lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
