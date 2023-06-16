package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis_Checking {

    public static boolean par_check(String st){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='(' || st.charAt(i)=='{' || st.charAt(i)=='['){
                s.push(st.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return  false;
                }
                else{
                    if(st.charAt(i)==')' && s.peek()=='(' || st.charAt(i)=='}' && s.peek()=='{' || st.charAt(i)==']' && s.peek()=='['  ){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

//         s = s.sort();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println(par_check(string));
    }
}
