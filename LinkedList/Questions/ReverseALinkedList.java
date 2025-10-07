package LinkedList.Questions;

public class ReverseALinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = LinkedList.traverseArr(arr);
        LinkedList.printLL(head);

//        head=reverseLLIterativeAppr(head);
        head=reverseLLRecursiveApproach(head);
        LinkedList.printLL(head);


    }

    public static Node reverseLLIterativeAppr(Node head){
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


    public static Node reverseLLRecursiveApproach(Node head){
        if (head==null|| head.next==null) return head;

        Node newHead = reverseLLRecursiveApproach(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}
