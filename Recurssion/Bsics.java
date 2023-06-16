package Recurssion;
import java.util.*;

public class Bsics {

    static void func1(int n){ //It will print 1 to n
        if(n == 0){
            return;
        }
        func1(n-1);
        System.out.println(n);
    }


    static void func2(int n){  // print n to 1
        if(n == 0){
            return;
        }
        System.out.println(n);
        func2(n-1);
    }


    static void sum_n(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+= i;
       sum_n(i+1,n,sum);
    }

    public static void fact(int n,int factorial){
        if(n == 0){
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        fact(n-1,factorial);
    }

    static int fact2(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = fact2(n-1);
        int fact = n*fact_nm1;
        return fact;
    }

    public static void fib(int a,int b,int n){
        if(n == 0)
        {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fib(b,c,n-1);
    }

    public static int printx_n(int x,int n){ // Stack height one
        if (n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int pow_xm1 = printx_n(x,n-1);
        int pow = x*pow_xm1;
        return pow;
    }

    public static int printx_n1(int x,int n){
        if (n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
//        if n is even
        if(n%2 == 0){
            return printx_n1(x,n/2)*printx_n1(x,n/2);
        }
        else{
            return printx_n1(x,n/2)*printx_n1(x,n/2)*x;
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        func1(5);

//        sum_n(1,5,0);

//        fact(5,1);

//        System.out.println(fact2(5));

//        int a = 0;
//        int b = 1;
//        int n = 7;
//        System.out.println(a);
//        System.out.println(b);
//        fib(a,b,n-2);

//        int x = 2;
//        int n = 5;
//        System.out.println(printx_n(x,n));

        int x = 2;
        int n = 5;
        System.out.println(printx_n1(x,n));




    }
}
