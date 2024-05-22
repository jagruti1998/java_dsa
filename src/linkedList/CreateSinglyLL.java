package linkedList;

import java.net.StandardSocketOptions;
import java.util.List;

public class CreateSinglyLL {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        //constructor
        public ListNode(int data){
            this.data=data;
            this.next=next;
        }
    }

    //create singly linked list  10 --> 1 --> 8 --> 11 -->null

    public static void main(String[] args){
        CreateSinglyLL sl=new CreateSinglyLL();
        sl.head=new ListNode(10);
        //create ListNodes with data
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        //now connect them together
        sl.head.next=second;
        second.next=third;
        third.next=fourth;

        //display the linked list
        sl.display();
        if(sl.search(head,10)){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

        //find nthnodefromend
        ListNode findKthNodeFromEnd=sl.findKthNodeFromEnd(2);
        System.out.println("Kth node from end is " +findKthNodeFromEnd.data);



    }

    //display the singly LinkedList
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data +" ---> ");
            current=current.next;
        }
        System.out.println("null");

    }

    //search and element in LL
    public boolean search(ListNode head,int x){
        ListNode current=head;

        while(current!=null){
            if(current.data==x){
                return true;
            }
            current=current.next;

        }
        return false;
    }

    //find kth node from the end of the ll
    public ListNode  findKthNodeFromEnd(int n){
        if(head==null){
            return null;
        }

        ListNode mainptr=head;
        ListNode refptr=head;
        int count =0;

        while(count<n){
            refptr=refptr.next;
            count++;
        }
        while (refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;

        }
        return mainptr;

    }
}
