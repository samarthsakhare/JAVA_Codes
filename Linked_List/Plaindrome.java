package Linked_List;

public class Plaindrome {

    Node2 head;

    class Node2{
        int data;
        Node2 next;

        Node2(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addF(int d){
        Node2 n = new Node2(d);
        if (head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void addL(int d){
        Node2 n = new Node2(d);
        if(head == null){
            head = n;
            return;
        }
        Node2 curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }

    public void print(){
        Node2 n = head;
        while(n!=null){
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        System.out.print("null");
        System.out.println();
    }


    // Palindrome Problem

    public boolean isPalindrome(){

        if(head == null || head.next == null){
            return true;
        }

        Node2 middle = findmiddle(head);
        Node2 secondHalfStart = reverse(middle.next);

        Node2 n = head;
        while(secondHalfStart!=null){
            if(secondHalfStart.data != n.data){
                return false;
            }
            n = n.next;
            secondHalfStart = secondHalfStart.next;
        }

        return  true;
    }

    public Node2 findmiddle(Node2 head){
        Node2 hire = head;
        Node2 turtule = head;

        while(hire.next !=null && hire.next.next!=null){
            hire = hire.next.next;
            turtule = turtule.next;
        }
        return turtule;
    }

    public Node2 reverse(Node2 head1){
        Node2 prev = null;
        Node2 curr = head1;
        while(curr!=null){
            Node2 nex_t = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nex_t;
        }
        return prev;
    }

    public static void main(String[] args) {
        Plaindrome l = new Plaindrome();
        l.addL(1);
        l.addL(2);
        l.addL(5);
        l.addL(2);
        l.addL(1);

        l.print();

        if(l.isPalindrome()){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}

