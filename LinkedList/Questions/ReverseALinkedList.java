package LinkedList.Questions;

public class ReverseALinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = LinkedList.traverseArr(arr);
        LinkedList.printLL(head);

        head=reverseLL(head);
        LinkedList.printLL(head);


    }

    public static Node reverseLL(Node head){
        Node prev=null;
        Node temp=head;

        while (temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
