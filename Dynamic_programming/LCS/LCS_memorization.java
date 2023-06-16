package Dynamic_programming.LCS;

import java.util.*;

public class LCS_memorization {

    static int t[][] = new int[102][102];

    public static int LCS_memo(String X, String Y, int n, int m){
        if(n==0 || m==0){
            return 0;
        }

        if(t[n][m]!=-1){
            return t[n][m];
        }

        if(X.charAt(n-1) == Y.charAt(m-1)){
            return t[n][m] = 1+LCS_memo(X, Y, n-1, m-1);
        }
        else{
            return t[n][m] = Math.max(LCS_memo(X, Y, n-1, m), LCS_memo(X, Y, n, m-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String X = sc.next();
        String Y = sc.next();

        int n = X.length();
        int m = Y.length();

        for(int i=0;i<102;i++){
            for(int j=0;j<102;j++){
                t[i][j] = -1;
            }
        }

        System.out.println(LCS_memo(X, Y, n, m));
    }
}
