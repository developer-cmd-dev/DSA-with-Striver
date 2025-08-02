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

        head=deleteKElement(head,1);
        printLL(head);

        head=insertHead(head,56);
        printLL(head);
        head=insertTail(head,56);
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

    public static Node2 deleteKElement(Node2 head,int k){
        if(head==null) return null;
        Node2 temp=head;
        int count=0;
        while (temp!=null){
            count++;
            if (count==k)break;
            temp=temp.next;
        }
        Node2 prev=temp.back;
        Node2 front=temp.next;
        if (prev==null && front==null){
            return null;
        }else if (prev==null){
            return deleteHead(temp);
        }else if (front==null){
            return deleteTail(temp);
        }else{
            prev.next=front;
            front.back=prev;
        }
        return head;
    }

    public static Node2 insertHead(Node2 head,int data){
        if(head==null) return new Node2(data);
        Node2 newEl=new Node2(data,head,null);
        head.back=newEl;
        return newEl;
    }

    public static Node2 insertTail(Node2 head,int data){
        if (head==null) return new Node2(data);

        Node2 temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node2 newEl=new Node2(data,null,temp);
        temp.next=newEl;
        return head;
    }


}
