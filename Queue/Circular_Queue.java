package Queue;

public class Circular_Queue {
    static class C_Queue{
        static int arr[];
        static int size = 0;
        static int rear = -1;
        static int front = -1;

        public C_Queue(int n){
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int n){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = n;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int num = arr[front];

            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return num;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        C_Queue cq = new C_Queue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.remove();
        cq.add(5);
        cq.add(6);
        cq.add(7);

        while (!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
