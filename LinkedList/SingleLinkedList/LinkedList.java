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

        int[] arr ={1,2,3,4,5};
        Node newNode = new Node(arr[0]);
        System.out.println(newNode.data);
    }

    public static void addLinkedList(int data,Node next){

    }



}

