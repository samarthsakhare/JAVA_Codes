package Dynamic_programming.Knapsack;

public class knapsack_memorization {

    static int t[][] = new int[102][1002];

    public static int knapsack_recur(int Wt[], int P[], int w, int n){
        if(w == 0 || n == 0){
            return 0;
        }

        if(t[n][w] != -1){
            return t[n][w];
        }

        if(Wt[n-1] <= w){
            return t[n][w] = Math.max(P[n-1]+knapsack_recur(Wt, P, w-Wt[n-1], n-1), knapsack_recur(Wt, P, w, n-1));
        }
        else{
            return t[n][w] = knapsack_recur(Wt, P, w, n-1);
        }
    }

    public static void main(String[] args) {
        int Wt[] = {1, 1, 1};
        int P[] = {2, 10, 30};
        int w = 2;
        int n = 3;

        for(int i=0;i<102;i++){
            for(int j=0;j<1002;j++){
                t[i][j] = -1;
            }
        }

        System.out.println(knapsack_recur(Wt, P, w, n));

    }
}
