package Linked_List;

public class DoublyLinkedList {

    private listNode head;
    private listNode tail;
    private int length = 0;

    private class listNode{
        private int data;
        private listNode next;
        private listNode prev;
        public listNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        if(length==0){
            return true;
        }
        return false;
    }

    public void addF(int  data){
        listNode n = new listNode(data);
        if(isEmpty()){
            tail = n;
        }
        else{
            head.prev = n;
        }
        n.next = head;
        head = n;
        length++;
    }

    public void addL(int data){
        listNode n = new listNode(data);
        if(isEmpty()){
            head = n;
        }
        else{
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
        length++;
    }

    public void delF(){
        if(isEmpty()){
            return;
        }
        if(head==tail){
            head=null;
            tail = null;
        }
        else{
            listNode h = head;
            head = head.next;
            h.next = null;
            head.prev = null;
        }
        length--;
    }

    public void delL(){
        if(isEmpty()){
            return;
        }
        if(head==tail){
            head = head.next;
            tail = tail.next;
        }
        else{
            listNode n = tail;
            tail = tail.prev;
            tail.next = null;
            n.prev = null;
        }
    }

    public void display_forward(){
        listNode temp = head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void display_backward(){
        listNode n = tail;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.prev;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addF(10);
        l.addF(9);
        l.addF(8);
        l.display_forward();
//        l.display_backward();
        l.delF();
        l.display_forward();
        l.delL();
        l.display_forward();
        l.delL();
        l.display_forward();
    }
}





















//public class DoublyLinkedList{
//
//    ListNode head;
//
//    class ListNode{
//        int data;
//        ListNode next;
//        ListNode prev;
//
//        ListNode(int data){
//            this.data = data;
//        }
//    }
//
//    public void addF(int data){
//        ListNode n = new ListNode(data);
//        n.next = head;
//        n.prev = null;
//        if(head!=null){
//            n.next = head;
//        }
//        head = n;
//    }
//
//    public void addL(int data){
//        ListNode n = new ListNode(data);
//        n.next = null;
//        ListNode n1 = head;
//        while(n1.next!=null){
//            n1= n1.next;
//        }
//        n.prev = n1;
//        n1.next = n;
//    }
//
//    public void delF(){
//        if(head == null){
//            return;
//        }
//        head = head.next;
//        head.prev = null;
//    }
//
//    public void delL(){
//        ListNode n1 = head;
//        ListNode n2 = head.next;
//        while(n2.next != null){
//            n2 = n2.next;
//            n1 = n1.next;
//        }
//        n1.next = null;
//        n2.prev = null;
//    }
//
//    public void displayF(){
//        ListNode n = head;
//        while(n!=null){
//            System.out.print(n.data+" ");
//            n = n.next;
//        }
//        System.out.println();
//    }
//
//    public void displayR(){
//        ListNode n = head;
//        while(n.next!=null){
//            n = n.next;
//        }
//        while(n.prev != null){
//            System.out.println(n.data+" ");
//            n = n.prev;
//        }
//    }
//
//    public static void main(String[] args) {
//        DoublyLinkedList dl = new DoublyLinkedList();
//        dl.addF(4);
//        dl.addF(3);
//        dl.addF(2);
//        dl.addF(1);
//        dl.addL(5);
//        dl.delF();
//        dl.addF(1);
//        dl.displayF();
//        dl.delL();
//        dl.displayF();
//        dl.displayR();
//    }
//}