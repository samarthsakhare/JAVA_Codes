package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_string {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for(int i=0;i<name.length();i++){
            s.push(name.charAt(i));
        }

        while (!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
