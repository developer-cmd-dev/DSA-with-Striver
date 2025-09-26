package LinkedList.DoubleLinkedList;


import java.util.HexFormat;

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

//        Array traverse in Doubly Linked List.
        int[] arr={1,2,3,4,5,6};
        Node2 head = traverseArr(arr);
        traverseLL(head);

//        Delete Head in Doubly Linked List.
        head = deleteHead(head);
        traverseLL(head);

//        Delete Tail in Doubly Linked List;
        head = deleteTail(head);
        traverseLL(head);

//        Delete Kth pos element;
        head = deleteKthPosEl(head,2);
        traverseLL(head);




    }



    public static Node2 traverseArr(int[] arr){
        Node2 head = new Node2(arr[0]);
        Node2 prev = head;

        for(int i=1;i<arr.length;i++){
            Node2 temp = new Node2(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }

        return head;
    }

    public static void traverseLL(Node2 head){
        Node2 temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-> <-");
            temp=temp.next;
        }
        System.out.println();
    }


    public static Node2 deleteHead(Node2 head){
        if (head==null || head.next ==null && head.back==null) return null;

        Node2 temp = head.next;
        temp.back=null;
        return head=temp;
    }

    public static Node2 deleteTail(Node2 head){
        Node2 temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }

        Node2 prev = temp.back;
        prev.next=null;
        temp.back=null;
        return head;
    }

    public static Node2 deleteKthPosEl(Node2 head,int k){
        if (head==null) return null;
        Node2 temp = head;
        int count=0;
        while (temp.next!=null){
            count++;
            if (count==k)break;
            temp=temp.next;
        }

        Node2 front = temp.next;
        Node2 prev= temp.back;

        if (prev==null && front==null){
            return null;
        }
        else if (prev==null) {
            deleteHead(head);
        }else if(front==null){
            deleteTail(head);
        }else{
            prev.next=front;
            front.back=prev;
        }
        return head;

    }






}
