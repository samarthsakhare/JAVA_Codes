package Linked_List;

public class DLL_P {

    Node head;
    Node tail;
    public static int length = 0;

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void addF(int data){
        Node n = new Node(data);

        if(head==null){
            head = n;
            tail = n;
            length++;
            return;
        }

        head.prev = n;
        n.next = head;
        head = n;
        length++;
    }

    public void addL(int data){
        Node n = new Node(data);

        if(head==null){
            head = n;
            tail = n;
            length++;
            return;
        }

        tail.next = n;
        n.prev = tail;
        tail = tail.next;
        length++;
    }

    public void print_forward(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void print_reverse(){
        Node n = tail;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.prev;
        }
        System.out.println();
    }

    public void delF(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        length--;
    }

    public void delL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        length--;
        tail = tail.prev;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        if(length==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        DLL_P list= new DLL_P();

        list.addF(10);
        list.addL(20);
        list.addL(30);
        list.addL(40);

        list.print_forward();
        list.print_reverse();

        System.out.println(list.getLength());
        System.out.println(list.isEmpty());

        list.delF();
        System.out.println(list.getLength());

        list.delL();
        System.out.println(list.getLength());
    }
}
