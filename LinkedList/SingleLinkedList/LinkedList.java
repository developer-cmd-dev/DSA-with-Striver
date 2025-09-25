package LinkedList.SingleLinkedList;


class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data = data;
        this.next=null;
    }
}



public class LinkedList {
    public static void main(String[] args) {
        System.out.println("This is linked list");

//        Create a Node in linked list.
        int[] arr ={1,2,3,4,5};
        Node newNode = new Node(arr[0]);

//        Convert Array to Linked List.
        Node head = convertArr2LL(arr);
        traverseLL(head);
    }

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            tail.next = temp;
            tail = temp;
        }

        return head;
    }

    public static void traverseLL(Node head){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }



}

