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

        Node head = convertArrToLL(arr);
        Node temp = head;
        System.out.println("Linked List");
        while (temp!=null){
            System.out.print(temp.getData()+"-> ");
            temp=temp.next;
        }
        System.out.println();
//
//        System.out.println("Length-> "+getLength(arr));
//
//        int target=4;
//        System.out.println("Search -> "+target+" "+ searchLL(head,target));
//
//
//         temp = deleteLL(head);
//        System.out.println("First Element deleted in Linked List");
//        while (temp!=null){
//            System.out.print(temp.getData()+"-> ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//        temp = deleteTail(head);
//        System.out.println("Tail Element deleted in Linked List");
//        while (temp!=null){
//            System.out.print(temp.getData()+"-> ");
//            temp=temp.next;
//        }

//        int k=7;
//         head = deleteKElementLL(head,k);
//         temp = head;
//        System.out.println("Linked List");
//        while (temp!=null){
//            System.out.print(temp.getData()+"-> ");
//            temp=temp.next;
//        }
//        System.out.println();

//        int el=1;
//        head = deleteElement(head,el);
//        printLL(head);

        head = insertHead(head,56);
        printLL(head);

        head=insertTail(head,78);
        printLL(head);

        head=insertAtKthIndex(head,88,5);
        printLL(head);





    }

    public static void printLL(Node head){
        Node temp = head;
        System.out.println("Linked List");
        while (temp!=null){
            System.out.print(temp.getData()+"-> ");
            temp=temp.next;
        }
        System.out.println();
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

    public static int getLength(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        int length=1;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            mover.next=newNode;
            mover=newNode;
            length++;
        }

        return length;
    }

    public static boolean searchLL(Node head,int target){
        Node temp = head;
        System.out.println("Linked List");
        while (temp!=null){
            if (temp.getData()==target) return true;
            temp=temp.next;
        }
        return false;

    }

    public static Node deleteLL(Node head){
        return head=head.next;
    }


    public static Node deleteTail(Node head){
        if (head==null||head.next==null)return null;

        Node temp = head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node deleteKElementLL(Node head,int k){
        if (head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        int count=0;Node temp=head;Node prev=null;
        while (temp!=null){
            count++;
            if (count==k){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static Node deleteElement(Node head,int el){
        if (head==null) return head;
        if (head.data==el){
            head=head.next;
            return head;
        }

        Node temp=head;Node prev=null;
        while (temp!=null){
            if (temp.data==el){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }

        return head;

    }

    public static Node insertHead(Node head,int data){
        return new Node(data,head);





    }

    public static Node insertTail(Node head,int data){
        if (head==null) return new Node(data);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node newEl=new Node(data);
        temp.next=newEl;
        return head;
    }

    public static Node insertAtKthIndex(Node head,int data,int k){
        if (head==null){
            if (k==1) return new Node(data);
            else return head;
        }
        if (k==1)return new Node(data,head);
        Node temp=head;int count=0;
        while (temp!=null){
            count++;
            if (count==(k-1)){
                Node x=new Node(data);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }




}
