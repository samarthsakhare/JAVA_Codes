package Strings;
import java.util.*;

public class Charges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int j=0;j<N;j++){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            String ns = "";


            while(!ns.equals(s)){
                if(n == 1){
                    if(s.charAt(0) == '0'){
                        System.out.println("The end");
                    }
                    else{
                        System.out.println("The end");
                    }
                }

                ns = "";

                if(s.charAt(0) == '0'){
                    ns += s.charAt(1);
                }else{
                    ns += s.charAt(0);
                }

                for(int i=1;i<n-1;i++){
                    if(s.charAt(i) == '0'){
                        if((s.charAt(i+1)=='+' && s.charAt(i-1)=='-')  || (s.charAt(i+1)=='-' && s.charAt(i-1)=='+')){
                            ns += '0';
                        }
                        else if(s.charAt(i+1) == '0' && s.charAt(i-1)=='0'){
                            ns += 0;
                        }
                        else if((s.charAt(i-1)=='0' && s.charAt(i+1)=='-') || (s.charAt(i-1)=='-' && s.charAt(i+1)=='0')){
                            ns += '-';
                        }
                        else{
                            ns += '+';
                        }
                    }
                    else{
                        ns += s.charAt(i);
                    }
                }

                if(s.charAt(n-1) == '0'){
                    ns += s.charAt(n-2);
                }
                else{
                    ns += s.charAt(n-1);
                }

                count = 0;
                for(int i=0;i<n;i++){
                    if(ns.charAt(i) == '0'){
                        count++;
                    }
                }

                if(count == 0){
                    System.out.println(0);
                    return;
                }

                s = ns;
            }

            System.out.println(count);
        }
    }
}
