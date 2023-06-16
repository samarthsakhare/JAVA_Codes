package Dynamic_programming.Knapsack;

public class unbounded_knapsack {

    public static int unbounded(int Wt[], int P[], int w, int n){
        int t[][] = new int[n+1][w+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(Wt[i-1]<= j){
                    t[i][j] = Math.max(P[i-1] + t[i][j-Wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][w];
    }

    public static void main(String[] args) {
        int Wt[] = {3, 4, 5};
        int P[] = {4, 3, 6};
        int w = 6;
        int n = Wt.length;

        System.out.println(unbounded(Wt, P, w, n));
    }
}
