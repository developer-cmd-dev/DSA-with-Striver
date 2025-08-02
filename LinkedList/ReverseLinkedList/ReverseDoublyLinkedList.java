package LinkedList.ReverseLinkedList;


import java.util.List;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node back;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }

    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
    int[] arr={4,3,2,1};
    Node head=traverseArray(arr);
    printLL(head);

         head=reverseLL(head);
        printLL(head);



    }

    public static Node traverseArray(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for (int i = 1; i <arr.length ; i++) {
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;

        }
        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        System.out.println("Doubly Linked List");
        while (temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node reverseLL(Node head){
        Stack<Integer> llData=new Stack<>();
        Node temp=head;
        while (temp!=null){
            llData.add(temp.data);
            temp=temp.next;
        }
        temp=head;

        while (temp!=null){
            temp.data=llData.peek();
            llData.pop();
            temp=temp.next;
        }
        return head;
    }
}
