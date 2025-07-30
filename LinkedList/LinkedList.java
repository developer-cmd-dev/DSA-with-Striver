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





public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(convertArrToLL(arr).getData());

        Node temp = convertArrToLL(arr);
        while (temp!=null){
            System.out.print(temp.getData()+"-> ");
            temp=temp.next;
        }


    }


    public static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            mover.next=newNode;
            mover=newNode;
        }

        return head;
    }


}
