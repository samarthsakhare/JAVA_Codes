package Sorting;

import java.util.Scanner;

public class Practice {

    public static void idx(int arr[],int s,int n){
        int sum = 0;
        int a=0;
        int b = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            b++;
            if(sum == s){
                System.out.print(a+" "+b);
                return;
            }
            else if(sum >s){
                sum = 0;
                a++;
                i = a;
                System.out.println(i);
                b = a;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int arr[] = new int[3];
        System.out.println(arr[2]);
    }
}
