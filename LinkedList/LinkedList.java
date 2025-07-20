package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    public int getData() {
        return data;
    }
}

class LS{
    Node head;
    Node tail;

    public Node add(int data){
        this.tail=head;
        if (this.head!=null){
            Node temp=new Node(data);
            this.tail.next=temp;
            this.tail=temp;
        }else {
            this.head=new Node(data);
            this.tail=head;
        }
        return tail;
    }

    public void data(){
        Node temp=this.head;
        while (temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }

}



public class LinkedList {
    public static void main(String[] args) {

        LS ls=new LS();
        ls.add(5);
        ls.add(8);
        ls.add(7);
        ls.add(9);
        ls.data();


    }

    public static Node ll(int[] arr){
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i <arr.length ; i++) {
            Node temp = new Node(arr[i]);
            tail.next=temp;
            tail=temp;
        }

        return head;
    }
}
