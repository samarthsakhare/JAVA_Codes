package Dynamic_programming.LCS;
import java.util.*;

public class Longest_common_subsequence {

    public static int LCS(String X, String Y, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }

        if(X.charAt(n-1) == Y.charAt(m-1)){
            return 1+LCS(X, Y,n-1,m-1);
        }
        else{
            return Math.max(LCS(X, Y, n-1, m), LCS(X, Y, n, m-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String X = sc.next();
        String Y = sc.next();

        int n = X.length();
        int m = Y.length();

        System.out.println(LCS(X, Y, n, m));
    }
}
