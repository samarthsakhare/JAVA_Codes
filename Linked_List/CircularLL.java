package Linked_List;

public class CircularLL {

    private Node head;

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addF(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            head.next = head;
        }
        else{
            Node n1 = head;
            while(n1.next!=head){
                n1 = n1.next;
            }
            n1.next = n;
            n.next = head;
            head = n;
        }
    }

    public void addL(int data){
        Node n =  new Node(data);
        if(head == null){
            head = n;
            head.next = head;
        }
        else{
            Node n2 = head;
            while(n2.next!=head){
                n2 = n2.next;
            }
            n2.next = n;
            n.next = head;
        }
    }

    public void delF(){
        if(head==null){
            return;
        }

        if (head.next == head) {
            head = null;
        }
        else{
            Node n = head;
            while(n.next!=head){
                n = n.next;
            }
            head = head.next;
            n.next = head;
        }
    }

    public void delL(){
        if(head==null){
            return;
        }
        if(head.next == null){
            head = null;
        }
        else{
            Node n1 = head;
            Node n2 = head.next;
            while (n2.next!=head){
                n1 = n1.next;
                n2 = n2.next;
            }
            n1.next =  head;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Sampla");
            return;
        }
        Node n = head;
        System.out.print(n.data+" ");
        n = n.next;
        while(n!=head){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL l = new CircularLL();
        l.addF(3);
        l.addF(2);
        l.addF(1);
        l.addL(4);
        l.addL(5);
        l.display();
        l.delL();
        l.delL();
        l.delL();
        l.delL();
        l.display();
        l.delL();
        l.display();
    }
}
