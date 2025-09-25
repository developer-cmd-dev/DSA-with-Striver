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
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        Node newNode = new Node(arr[0]);

//        Convert Array to Linked List.
        Node head = convertArr2LL(arr);
        traverseLL(head);

//        Search in Linked List.
        System.out.println(searchInLL(head,4));

//        Delete head in Linked List.
        head = deletehead(head);
        traverseLL(head);

//        Delete Tail in Linked List.
        deleteTail(head);
        traverseLL(head);

//        Delete Kth element From the linked List.
        deleteKthElement(head,4);
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
        System.out.println();
    }

    public static boolean searchInLL(Node head,int target){
        Node temp = head;
        while (temp!=null){
            if(temp.data==target)return true;
            temp=temp.next;
        }
    return false;
    }

    public static Node deletehead(Node head){
        if(head==null)return head;
        Node temp = head;
        head=head.next;
        return head;
    }

    public static void deleteTail(Node head){
        if(head==null || head.next==null)return;
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

temp.next = null;
    }

    public static Node deleteKthElement(Node head,int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }

        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next = prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }



}

