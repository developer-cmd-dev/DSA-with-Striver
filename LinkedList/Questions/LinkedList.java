package LinkedList.Questions;


class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5}; //end
        int[] arr2 = {1,2,3,4,5,6};
    }

    public static Node traverseArr(int[] arr){
        Node head = new Node(arr[0]);
        Node tail=head;
        for (int i = 1; i <arr.length ; i++) {
            Node newNode = new Node(arr[i]);
            tail.next=newNode;
            tail=newNode;
        }
        return head;
    }

    public static void printLL(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }
}
