package Stack;

public class Implementaion_of_stack_using_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node n = new Node(data);
            if(isEmpty()){
                head =  n;
                return;
            }
            n.next = head;
            head = n;
        }

        public static int pop(){
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
