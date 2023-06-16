package Linked_List;

public class MergeTwoSortedLists {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addL(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
        }
        Node n1 = head;
        while(n1.next!=null){
            n1 = n1.next;
        }
        n1.next = n;
        n.next = null;
    }

    public void display(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists l = new MergeTwoSortedLists();
        l.addL(10);
        l.addL(20);
        l.addL(30);
        l.display();
    }
}
