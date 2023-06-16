package Queue;

public class Using_Linked_List {
    static Node head;
    static Node tail;

    static class Node{
        Node next;
        int data;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void add(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    public static int remove(){
        if(head == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int num = head.data;
        head = head.next;
        return num;
    }

    public static void display(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Using_Linked_List l = new Using_Linked_List();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.remove();
        l.display();
    }
}
