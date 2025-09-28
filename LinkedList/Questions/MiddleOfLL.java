package LinkedList.Questions;





public class MiddleOfLL {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        Node head=LinkedList.traverseArr(arr);
        LinkedList.printLL(head);

        Node ans=middleOfLL(head);
        System.out.println(ans.data);

    }




    public static Node middleOfLL(Node head){
        Node temp=head,slow=head,fast=head;
        if (head==null) return null;
        if (fast.next==null) return fast;

        while (fast!=null &&fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

}
