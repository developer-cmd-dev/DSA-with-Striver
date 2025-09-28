package LinkedList.DoubleLinkedList;


class Node3{
    int data;
    Node3 next;
    Node3 back;

    Node3(int data, Node3 next,Node3 back){
        this.data=data;
        this.next=next;
        this.back=back;
    }

    Node3(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}


public class ReverseDLL {
    public static void main(String[] args) {
    int[] arr = {4,3,2,1};
    Node3 head= traverseArr(arr);
    traverseLL(head);

    head=reverseDLL(head);
    traverseLL(head);

    }

    public static Node3 traverseArr(int[] arr){
        Node3 head = new Node3(arr[0]);
        Node3 prev = head;
        for (int i = 1; i <arr.length ; i++) {
            Node3 newNode = new Node3(arr[i],null,prev);
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }

    public static void traverseLL(Node3 head){
        Node3 temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-> <-");
            temp=temp.next;
        }
        System.out.println();
    }


    public static Node3 reverseDLL(Node3 head){
        Node3 current = head;
        Node3 prev = null;

        while (current!=null){
            prev=current.back;
            current.back=current.next;
            current.next=prev;
            current=current.back;
        }


        assert prev != null;
        return prev.back;
    }


}
