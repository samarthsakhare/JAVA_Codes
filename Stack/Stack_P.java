package Stack;

import java.util.Stack;

public class Stack_P {

    public static void pushAtB(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.add(data);
            return ;
        }

        int top = s.pop();
        pushAtB(s, data);
        s.add(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtB(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while(!s.isEmpty()){
            int top = s.peek();
            s.pop();
            System.out.println(top);
        }

    }
}
