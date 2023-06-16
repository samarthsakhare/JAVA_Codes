package Dynamic_programming;

public class fibonacci_series {

    public static void DP_fibo(int n){

        if(n == 0){
            System.out.println(0);
            return;
        }
        else if(n == 1){
            System.out.println(0+" "+0);
            return;
        }
        else if( n == 2){
            System.out.println(0+" "+0+" "+1);
            return;
        }

        int arr[] = new int[n+1];

        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;

        for(int i=3;i<n+1;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        DP_fibo(6);
    }
}
