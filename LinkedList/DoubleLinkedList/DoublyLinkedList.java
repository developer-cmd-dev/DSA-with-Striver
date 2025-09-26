package LinkedList.DoubleLinkedList;



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
        Node2 head = traverseArr(arr);
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


    }




}
