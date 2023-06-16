
// Aapna clg approach

package Linked_List;

public class LL {

    Node head;

    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void addBetween(String data,int n){
        Node newNode = new Node(data);
        Node currNode1 = head;
        Node currNode2 = head.next;
        int i=0;
        while(i<n-1){
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        }
        currNode1.next = newNode;
        newNode.next = currNode2;
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){

        if(head == null){
            System.out.println("List is empty we cannot perform delete");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node curr1 = head;
        Node curr2 = head.next;

        while(curr2.next != null){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        curr1.next = null;
    }

    public void deleteBetween(int n){
        Node currN1 = head;
        Node currN2 = head.next;
        int i=0;

        while(i<n-1){
            currN1 = currN1.next;
            currN2 = currN2.next;
        }

        currN1.next = currN2.next;
    }

    public void reverse(){

        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;

       while (curr != null){
           Node nexN = curr.next;
           curr.next = prev;

           prev = curr;
           curr = nexN;
       }
        head.next = null;
        head = prev;
    }


    public static void main(String[] args) {
        LL l_1 = new LL();
//        l_1.addLast("a");
//        l_1.addLast("LinkedList");
//        l_1.addFirst("is");
//        l_1.addFirst("This");
//        l_1.printList();
//        l_1.deleteFirst();
//        l_1.printList();
//        l_1.deleteLast();
//        l_1.printList();
//        l_1.addBetween("L",1);
//        l_1.printList();
////        l_1.deleteBetween(1);
//        l_1.reverse();
//        l_1.printList();


    }
}























//Using access modifiers

//public class LL{
//
//    private Node head;
//
//    private static class Node{
//        private int data;
//        private Node next;
//
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void addF(int d){
//     Node n = new Node(d);
//     if(head ==null){
//         head = null;
//     }
//     n.next = head;
//     head = n;
//    }
//
//    public void display(){
//        Node curr = head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr = curr.next;
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        LL l = new LL();
//        l.addF(40);
//        l.addF(30);
//        l.addF(20);
//        l.addF(10);
//        l.display();
//    }
//}