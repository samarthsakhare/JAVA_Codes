package Linked_List;

public class FindingLoop {

    Node3 head;

    class Node3 {
        int data;
        Node3 next;

        Node3(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addF1(int d) {
        Node3 n = new Node3(d);
        if (head == null) {
            head = n;
        }
        n.next = head;
        head = n;
    }

    public void addL1(int d) {
        Node3 n = new Node3(d);
        if (head == null) {
            head = n;
            return;
        }

        Node3 newN = head;
        while (newN.next != null) {
            newN = newN.next;
        }
        newN.next = n;
    }

    public void printL() {
        Node3 n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean hasCycle() {

        if (head == null) {
            return false;
        }

        Node3 fast = head;
        Node3 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public void makeLoop(int n) {
        Node3 l = head;
        while (l.next != null) {
            l = l.next;
        }
        Node3 i = head;
        int j = 0;
        while (j < n) {
            i = i.next;
            j++;
        }
        l.next = i;
    }


    public static void main(String[] args) {
        FindingLoop f = new FindingLoop();
        f.addL1(10);
        f.addL1(20);
        f.addL1(30);
        f.addL1(40);
        f.addL1(50);
        f.addL1(60);
        f.printL();
//        f.makeLoop(2);
        if(f.hasCycle()){
            System.out.println("Loop is present");
        }else{
            System.out.println("Loop is not present");
        }
        f.printL();

    }
}

