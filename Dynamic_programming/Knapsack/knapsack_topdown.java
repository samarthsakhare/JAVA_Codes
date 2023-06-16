package Dynamic_programming.Knapsack;

public class knapsack_topdown{

    public static int topdown(int W[], int P[], int w, int n){
        int t[][] = new int[n+1][w+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j = 1;j<w+1;j++){
                if(W[i-1] <= j){
                    t[i][j] = Math.max((P[i-1]+t[i-1][j-W[i-1]]), t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][w];
    }

    public static void main(String[] args) {
        int Wt[] = {1, 1, 1};
        int P[] = {20 , 10, 30};
        int w = 2;
        int n = 3;

        System.out.println(topdown(Wt, P, w, n));
    }
}
