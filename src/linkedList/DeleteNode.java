package linkedList;

import java.util.Scanner;

public class DeleteNode {
    int val;
    DeleteNode next;

    DeleteNode(int val) {
        this.val = val;
    }

    public static class Solution {
        public void deleteNode(DeleteNode node) {
            if (node == null) return;

            if (node.next != null) {
                int nextValue = node.next.val;
                node.next = node.next.next;
                node.val = nextValue;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of nodes: ");
            int n = scanner.nextInt();

            System.out.print("Enter the values of nodes: ");
            DeleteNode head = new DeleteNode(scanner.nextInt());
            DeleteNode current = head;

            for (int i = 1; i < n; i++) {
                current.next = new DeleteNode(scanner.nextInt());
                current = current.next;
            }

            System.out.print("Enter the value of the node to delete: ");
            int deleteValue = scanner.nextInt();

            DeleteNode toDelete = head;
            while (toDelete != null) {
                if (toDelete.val == deleteValue) {
                    break;
                }
                toDelete = toDelete.next;
            }

            if (toDelete != null) {
                Solution solution = new Solution();
                solution.deleteNode(toDelete);
                System.out.println("Node deleted.");
            } else {
                System.out.println("Node not found.");
            }

            scanner.close();
        }
    }
}
