package Stack;

import java.util.Stack;

public class Using_Collection_frameworks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
