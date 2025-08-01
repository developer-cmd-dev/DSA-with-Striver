package LinkedList;



class Node2{
    int data;
    Node2 next;
    Node2 back;

    public Node2(int data, Node2 next, Node2 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    public Node2(int data){
        this.data=data;
        next=null;
        back=null;
    }
}



public class DoublyLinkedList {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        Node2 head=traverseArray(arr);
        printLL(head);

        head=deleteHead(head);
        printLL(head);
        head=deleteTail(head);
        printLL(head);



    }

    public static void printLL(Node2 head){
        Node2 temp = head;
        System.out.println("Doubly Linked List");
        while (temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }



    public static Node2 traverseArray(int[] arr){
        Node2 head=new Node2(arr[0]);
        Node2 prev=head;
        for (int i = 1; i <arr.length ; i++) {
            Node2 temp=new Node2(arr[i],null,prev);
            prev.next=temp;
            prev=temp;

        }
        return head;
    }

    public static Node2 deleteHead(Node2 head){
        if (head==null) return head;

        if (head.next==null && head.back==null) return null;

        Node2 temp=head.next;
        temp.back=null;
        head=temp;
        return head;

    }
    public static Node2 deleteTail(Node2 head){
        if (head==null) return head;


        Node2 tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node2 prev = tail.back;
        prev.next=null;
        return head;

    }


}
