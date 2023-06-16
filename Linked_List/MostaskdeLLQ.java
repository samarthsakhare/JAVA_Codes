package Linked_List;

public class MostaskdeLLQ {

    Node1 head;

    class Node1{
        int data;
        Node1 next;

        Node1(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addF(int d){
        Node1 n = new Node1(d);
        if (head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void addL(int d){
        Node1 n = new Node1(d);
        if(head == null){
            head = n;
            return;
        }
        Node1 curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }

    public void print(){
        Node1 n = head;
        while(n!=null){
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int IndexFromLast(int n_o){
        int i = 0;
        Node1 n = head;
        int length = -1;
        int r = 0;
        while(n != null){
            n = n.next;
            length++;
        }
        Node1 n1 = head;
        while(n1 != null){
            n1 = n1.next;
            if(n1.data == n_o){
                r = length-i;
                return r;
            }
            i++;
        }
        return -1;
    }

    public void deletebet(int i){
        Node1 a = head;
        Node1 b = head.next;
        int j=0;
        while(j<i-1){
            a = a.next;
            b = b.next;
            j++;
        }
        a.next = b.next;
    }

    public int length()
    {
        int l = 0;
        Node1 n = head;
        while(n!=null){
            n = n.next;
            l++;
        }
        return l;
    }


    public int sum(){
        Node1 prev = head;
        Node1 curr = head.next;

        while(curr!=null){
            Node1 n = curr.next;

            curr.next = prev;
            prev = curr;
            curr = n;
        }
        head.next = null;
        head = prev;

        Node1 s = head;
        int s1 = 0;
        while(s!=null){
            s1 = 10*s1 + s.data;
            s = s.next;
        }
        return s1;
    }


    public static void main(String[] args) {
        MostaskdeLLQ l1 = new MostaskdeLLQ();
//        l1.addL(1);
//        l1.addL(2);
//        l1.addL(2);
//        l1.addL(1);
//        l1.print();
//        int a = l1.length() - l1.IndexFromLast(20);
//        l1.deletebet(a);
//        l1.print();

        l1.addL(5);
        l1.addL(2);
        l1.addL(1);

        System.out.println(l1.sum());


    }
}
