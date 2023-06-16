package Queue;

public class Queue_P {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        public Queue(int size){
            arr = new int[size];
            Queue.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front==-1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int e = arr[front];

            if(rear==front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return e;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        public static void display(){
            int i = front;
            int j = rear;
            while(i!=j){
                System.out.print(arr[i]+" ");
                i = (i+1)%size;
            }
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

        q.remove();
        q.add(6);

        q.display();
        q.add(7);
    }
}
