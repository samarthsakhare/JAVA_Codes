package Dynamic_programming.Knapsack;
import java.util.*;

public class knapsck_recurssive {

    public static int knapsack_recur(int Wt[], int P[], int w, int n){
        if(w == 0 || n == 0){
            return 0;
        }

        if(Wt[n-1] <= w){
            return Math.max(P[n-1]+knapsack_recur(Wt, P, w-Wt[n-1], n-1), knapsack_recur(Wt, P, w, n-1));
        }
        else{
            return knapsack_recur(Wt, P, w, n-1);
        }
    }

    public static void main(String[] args) {
        int Wt[] = {1, 1, 1};
        int P[] = {20, 10, 30};
        int w = 2;
        int n = 3;

        System.out.println(knapsack_recur(Wt, P, w, n));

    }
}
